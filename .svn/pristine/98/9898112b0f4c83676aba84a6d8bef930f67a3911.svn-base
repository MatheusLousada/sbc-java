@Echo off
 setlocal enableextensions

Set URL_SERVIDOR=http://www.compras.saobernardo.sp.gov.br/Services/
::Set URL_SERVIDOR=http://comprashmg.pmsbc.gov.br/Services/


::Referencia
::wsimport -p br.gov.sp.saobernardo.paradigma.ws -keep -verbose   D:\workspace\paradigma_ws\Categoria.wsdl -target 2.0


SET SERVICOS_PARADIGMA=CompraDireta Almoxarifado Aplicacao Banco Categoria CentroCusto Cfop CondicaoPagamento ContaContabil 
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% Contrato Convite Departamento Documento Empenho Empresa EmpresaBanco EmpresaClasse 
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% EmpresaCondicaoPagamento EmpresaGestao EmpresaProduto Erro FonteRecurso Gestao 
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% GrupoCompra GrupoConta IntegracaoPorEmpresa Iva Leilao Marca Moeda MoedaCotacao 
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% NaturezaDespesa NotaFiscal NotaFiscalTituloResumida OrdemCompra Patrimonio Pedido
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% PregaoEletronico Prioridade Produto ProdutoCompraHistorico ProdutoNaturezaDespesa 
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% ProdutoUnidadeMedida Requisicao ResultadoProcesso Titulo UnidadeMedida UnidadeNegocio 
SET SERVICOS_PARADIGMA=%SERVICOS_PARADIGMA% Usuario WbtDePara WbtLog WfAlcada WfAtividade Cotacao

cd ..\paradigmabs
rd /S /Q br

call gojava6.bat

for %%s in ( %SERVICOS_PARADIGMA% ) do (

    for /F "delims=" %%a in ( 'php -f d:\tools\bat\tolower.php %%s' ) do ( 
    	wsimport -p br.gov.sp.saobernardo.paradigma.ws.%%a -keep -verbose  %URL_SERVIDOR%%%s.svc?wsdl -target 2.0 
	)

 )
 
 :: Gerar somente a Categoria de maneira diferenciada
wsimport -p br.gov.sp.saobernardo.paradigma.ws.categoria -keep -verbose ../gerador_ws/Categoria.wsdl -target 2.0

cd ..	
 

GOTO FIM
    	-encoding UTF8

REM <!-- Endreço de todas webservices http://10.1.0.160/services/ -->
REM http://10.1.0.160/services/Almoxarifado.svc?wsdl
REM http://10.1.0.160/services/Aplicacao.svc?wsdl
REM http://10.1.0.160/services/Banco.svc?wsdl
REM http://10.1.0.160/services/Categoria.svc?wsdl
REM http://10.1.0.160/services/CentroCusto.svc?wsdl
REM http://10.1.0.160/services/Cfop.svc?wsdl
REM http://10.1.0.160/services/CompraDireta.svc?wsdl
REM http://10.1.0.160/services/CondicaoPagamento.svc?wsdl
REM http://10.1.0.160/services/ContaContabil.svc?wsdl
REM http://10.1.0.160/services/Contrato.svc?wsdl
REM http://10.1.0.160/services/Convite.svc?wsdl
REM http://10.1.0.160/services/Cotacao.svc?wsdl
REM http://10.1.0.160/services/Departamento.svc?wsdl
REM http://10.1.0.160/services/Documento.svc?wsdl
REM http://10.1.0.160/services/Empenho.svc?wsdl
REM http://10.1.0.160/services/Empresa.svc?wsdl
REM http://10.1.0.160/services/EmpresaBanco.svc?wsdl
REM http://10.1.0.160/services/EmpresaClasse.svc?wsdl
REM http://10.1.0.160/services/EmpresaCondicaoPagamento.svc?wsdl
REM http://10.1.0.160/services/EmpresaGestao.svc?wsdl
REM http://10.1.0.160/services/EmpresaProduto.svc?wsdl
REM http://10.1.0.160/services/Erro.svc?wsdl
REM http://10.1.0.160/services/FonteRecurso.svc?wsdl
REM http://10.1.0.160/services/Gestao.svc?wsdl
REM http://10.1.0.160/services/GrupoCompra.svc?wsdl
REM http://10.1.0.160/services/GrupoConta.svc?wsdl
REM http://10.1.0.160/services/IntegracaoPorEmpresa.svc?wsdl
REM http://10.1.0.160/services/Iva.svc?wsdl
REM http://10.1.0.160/services/Leilao.svc?wsdl
REM http://10.1.0.160/services/Marca.svc?wsdl
REM http://10.1.0.160/services/Moeda.svc?wsdl
REM http://10.1.0.160/services/MoedaCotacao.svc?wsdl
REM http://10.1.0.160/services/NaturezaDespesa.svc?wsdl
REM http://10.1.0.160/services/NotaFiscal.svc?wsdl
REM http://10.1.0.160/services/NotaFiscalTituloResumida.svc?wsdl
REM http://10.1.0.160/services/OrdemCompra.svc?wsdl
REM http://10.1.0.160/services/Patrimonio.svc?wsdl
REM http://10.1.0.160/services/Pedido.svc?wsdl
REM http://10.1.0.160/services/PregaoEletronico.svc?wsdl
REM http://10.1.0.160/services/Prioridade.svc?wsdl
REM http://10.1.0.160/services/Produto.svc?wsdl
REM http://10.1.0.160/services/ProdutoCompraHistorico.svc?wsdl
REM http://10.1.0.160/services/ProdutoNaturezaDespesa.svc?wsdl
REM http://10.1.0.160/services/ProdutoUnidadeMedida.svc?wsdl
REM http://10.1.0.160/services/Requisicao.svc?wsdl
REM http://10.1.0.160/services/ResultadoProcesso.svc?wsdl
REM http://10.1.0.160/services/Titulo.svc?wsdl
REM http://10.1.0.160/services/UnidadeMedida.svc?wsdl
REM http://10.1.0.160/services/UnidadeNegocio.svc?wsdl
REM http://10.1.0.160/services/Usuario.svc?wsdl
REM http://10.1.0.160/services/WbtDePara.svc?wsdl
REM http://10.1.0.160/services/WbtLog.svc?wsdl
REM http://10.1.0.160/services/WfAlcada.svc?wsdl
REM http://10.1.0.160/services/WfAtividade.svc?wsdl


:FIM