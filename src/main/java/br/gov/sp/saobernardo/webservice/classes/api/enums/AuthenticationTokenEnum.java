package br.gov.sp.saobernardo.webservice.classes.api.enums;

public enum AuthenticationTokenEnum {
    
    PREFEITURA("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE2NzU3Njk5MjIsInVzZXJJZCI6Njg4LCJ0eXBlQWNjZXNzIjoib3JnYW5pemF0aW9uIiwicHJvdmlkZXJJZCI6bnVsbCwib3JnYW5pemF0aW9uSWQiOiIxIiwib3JnYW5pemF0aW9uVW5pdElkIjoiMSIsInByaWNlQmFzZSI6eyJvd25lcklkIjoiMTZmYjA5NGRmMDA5ZmNkMDEzMmI4YTFlNTBhZDc4ZTMiLCJpc0FkbWluIjp0cnVlfX0.7XxoiECrZnf49OuJrkMmSYWHtaBzhNC4O18BXdVOpX4"),
    SBC_PREV("token SBC_PREV"),
    FACULDADE_DIREITO("token FACULDADE");

    private final String token;

    AuthenticationTokenEnum(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
