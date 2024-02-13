#!/usr/bin/bash
# Importa os webservices definidos em http://10.1.0.160/services

# URLs
URL_PRODUCAO=https://www.compras.saobernardo.sp.gov.br/Services
URL_HOMOLOGACAO=https://comprashmg.pmsbc.gov.br/Services
URL_SERVIDOR=$URL_PRODUCAO

# Referencia
#  curl  https://compras.saobernardo.sp.gov.br/services/Categoria.svc?wsdl --header 'Content-Type: text/xml;charset=UTF-8'
# wsimport -p br.gov.sp.saobernardo.paradigma.ws -keep -verbose  http://10.1.0.160/services/Categoria.wsdl -target 2.0



WSERV1=( Almoxarifado  Aplicacao )
#Banco CentroCusto Cfop CondicaoPagamento ContaContabil Contrato Convite  )
#WSERV2=( Departamento  Documento Empenho Empresa EmpresaBanco EmpresaClasse EmpresaCondicaoPagamento EmpresaGestao EmpresaProduto Erro )
#WSERV3=( FonteRecurso  Gestao GrupoCompra GrupoConta IntegracaoPorEmpresa Iva Leilao Marca Moeda MoedaCotacao NaturezaDespesa NotaFiscal )
#WSERV4=( NotaFiscalTituloResumida OrdemCompra Patrimonio Pedido PregaoEletronico Prioridade Produto ProdutoCompraHistorico ProdutoNaturezaDespesa)
#WSERV5=( ProdutoUnidadeMedida Requisicao ResultadoProcesso Titulo UnidadeMedida UnidadeNegocio Usuario WbtDePara WbtLog WfAlcada WfAtividade )

ws_wbc=("${WSERV1[@]}" "${WSERV2[@]}" "${WSERV3[@]}" "${WSERV4[@]}" "${WSERV5[@]}")
#ws_wbc=(Categoria WbtDePara)


cd ../paradigmabs
pwd
rm -rf ./br

# Configurar para java6 se necessario
#Maquina do Alexandre
if [ -d "/d/tools/java/jdk1.6.0_20/" ] 
   then
	  export JAVA_HOME=/d/tools/java/jdk1.6.0_20/
	  export PATH=$JAVA_HOME/bin:$PATH
fi

for item in ${ws_wbc[*]}
do
    nomePacote="br.gov.sp.saobernardo.paradigma.ws.`echo $item | tr [:upper:] [:lower:]`"
    #wsimport -p $nomePacote -keep -verbose  http://10.1.0.160/services/$item.svc?wsdl -target 2.0
    curl      $URL_SERVIDOR/$item.svc?wsdl --header 'Content-Type: text/xml;charset=UTF-8' -o $item.wsdl
    wsimport -p $nomePacote -keep -verbose  $URL_SERVIDOR/$item.svc?wsdl -target 2.0
done

#Casos com intervenção manual na definicao
# Procurar pela marcacao <!-- ALTERADO --> dentro do arquivo wsdl
WSMANUAL=( Categoria Cotacao CompraDireta )

#wsimport -p br.gov.sp.saobernardo.paradigma.ws.categoria -keep -verbose ../gerador_ws/Categoria.wsdl -target 2.0
#wsimport -p br.gov.sp.saobernardo.paradigma.ws.cotacao -keep -verbose ../gerador_ws/Cotacao.wsdl -target 2.0
for item in ${WSMANUAL[*]}
do
    nomePacote="br.gov.sp.saobernardo.paradigma.ws.`echo $item | tr [:upper:] [:lower:]`"
    wsimport -p $nomePacote -keep -verbose ../gerador_ws/$item.wsdl -target 2.0
done

echo `pwd`

chmod -R 666 br/*

# Converte o encondig
cd br/gov/sp/saobernardo/paradigma/ws/wbtdepara/
echo "Alterando Enconding"
mv ./EnumTipoDocumento.java enum_tipo_old.java
iconv -t UTF-8 -f ISO-8859-1 ./enum_tipo_old.java  > ./EnumTipoDocumento.java
rm -rf ./enum_tipo_old.java
echo "Encoding alterado"
cd -

#Remove do controle do Subversion
svn rm br --keep-local
svn ci -m'Classes geradas removidas do svn'
cd ../gerador_ws

#---eof---#