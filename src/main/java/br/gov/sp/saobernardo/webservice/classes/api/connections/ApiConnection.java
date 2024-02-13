    package br.gov.sp.saobernardo.webservice.classes.api.connections;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.net.HttpURLConnection;
    import java.net.URL;
    import java.util.Map;

    import com.google.gson.JsonArray;
    import com.google.gson.JsonElement;
    import com.google.gson.JsonObject;
    import com.google.gson.JsonParser;
    import com.google.gson.JsonSyntaxException;

    public class ApiConnection {

        public static String makeRequest(String url, String method, Map<String, String> headers, String contentType,
                String requestBody) {

            HttpURLConnection connection = null;

            try {

                connection = configurarConexao(url, method, contentType, headers);
                configurarBody(connection, requestBody);
                int responseCode = connection.getResponseCode();
                String response = processarResposta(connection);

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    return response;
                } else {
                    tratarErro(response, responseCode);
                }

            } catch (IOException e) {
                System.out.println("Error makeRequest: ");
                System.out.println("-------------------------------");
                e.printStackTrace();
            } finally {
                fecharConexao(connection);
            }

            return null;
        }

        private static HttpURLConnection configurarConexao(String url, String method, String contentType,
                Map<String, String> headers) throws IOException {

            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

            connection.setRequestMethod(method);
            connection.setRequestProperty("Content-Type", contentType);
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }

            return connection;
        }

        private static void configurarBody(HttpURLConnection connection, String requestBody) throws IOException {

            if (requestBody != null && !requestBody.isEmpty()) {
                connection.setDoOutput(true);
                connection.getOutputStream().write(requestBody.getBytes("UTF-8"));
            }
        }

        private static String processarResposta(HttpURLConnection connection) throws IOException {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder responseBuilder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    responseBuilder.append(line);
                }

                String response = responseBuilder.toString();
                try {
                    JsonElement jsonElement = JsonParser.parseString(response);
                    if (jsonElement.isJsonObject()) {
                        JsonObject jsonResponse = jsonElement.getAsJsonObject();
                        return processarObjetoJson(jsonResponse);
                    } else if (jsonElement.isJsonArray()) {
                        JsonArray jsonArray = jsonElement.getAsJsonArray();
                        return processarArrayJson(jsonArray);
                    } else {
                        System.out.println("A resposta recebida não é um objeto ou array JSON válido.");
                        return null;
                    }
                } catch (JsonSyntaxException e) {
                    System.out.println("Erro na análise do JSON: " + e.getMessage());
                    return null;
                }
            }
        }

        private static String processarObjetoJson(JsonObject jsonObject) {
            return jsonObject.toString();
        }

        private static String processarArrayJson(JsonArray jsonArray) {
            return jsonArray.toString();
        }

        private static void tratarErro(String response, int responseCode) {
            System.out.println("Falha na requisição. Código de resposta: " + responseCode);
            System.out.println("---------------------------------");
            System.out.println("response: ");
            System.out.println(response);
            System.out.println("---------------------------------");
        }

        private static void fecharConexao(HttpURLConnection connection) {

            if (connection != null) {
                connection.disconnect();
            }
        }
    }
