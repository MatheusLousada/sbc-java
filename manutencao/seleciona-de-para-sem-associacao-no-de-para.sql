--EMPRESA
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 2;
--DECLARE @tabela AS VARCHAR(255) = 'EMPRESA';
--DECLARE @id AS VARCHAR(255) = 'nCdEmpresa';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sNrCnpj';

--PRODUTO
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 3;
--DECLARE @tabela AS VARCHAR(255) = 'PRODUTO';
--DECLARE @id AS VARCHAR(255) = 'nCdProduto';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sCdProdutoEmpresa';

--CLASSE_PRODUTO
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 4;
--DECLARE @tabela AS VARCHAR(255) = 'CLASSE_PRODUTO';
--DECLARE @id AS VARCHAR(255) = 'nCdClasse';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sCdClasseEmpresa';

--UNIDADE_MEDIDA
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 5;
--DECLARE @tabela AS VARCHAR(255) = 'UNIDADE_MEDIDA';
--DECLARE @id AS VARCHAR(255) = 'nCdUnidadeMedida';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sSgUnidadeMedida';

--MOEDA
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 10;
--DECLARE @tabela AS VARCHAR(255) = 'MOEDA';
--DECLARE @id AS VARCHAR(255) = 'nCdMoeda';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sNrCnpj';

--TIPO FRETE
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 11;
--DECLARE @tabela AS VARCHAR(255) = 'FRETE';
--DECLARE @id AS VARCHAR(255) = 'nCdFrete';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sNrCnpj';

--USUARIO
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 12;
--DECLARE @tabela AS VARCHAR(255) = 'USUARIO';
--DECLARE @id AS VARCHAR(255) = 'sCdUsuario';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sCdUsuario';

--CONDICAO_PAGAMENTO
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 13;
--DECLARE @tabela AS VARCHAR(255) = 'CONDICAO_PAGAMENTO';
--DECLARE @id AS VARCHAR(255) = 'nCdCondicaoPagamento';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sNrCnpj';

--PRAZO_ENTREGA
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 21;
--DECLARE @tabela AS VARCHAR(255) = 'PRAZO_ENTREGA';
--DECLARE @id AS VARCHAR(255) = 'nCdPrazoEntrega';
--DECLARE @codigoMunicipio AS VARCHAR(255) = 'sNrCnpj';

--????????? - Não consegui relacionar este item
--DECLARE @nCdTipoDocumento AS VARCHAR(255) = 180;
--DECLARE @tabela AS VARCHAR(255) = '?????????';
--DECLARE @id AS VARCHAR(255) = '?????????';
--DECLARE @codigoMunicipio AS VARCHAR(255) = '?????????';

EXEC(
'
SELECT
	WBT_DE_PARA.nCdDePara
	,WBT_DE_PARA.nCdEmpresa
	,WBT_DE_PARA.nCdTipoDocumento
	,WBT_DE_PARA.sCdItemWBC
	,WBT_DE_PARA.sCdItemEmpresa
	,WBT_DE_PARA.sDsDescricao
	,WBT_DE_PARA.tDtAtualizacao
	,'+@tabela+'.'+@id+'
FROM
	WBT_DE_PARA
LEFT JOIN
	'+@tabela+'
ON
	'+@tabela+'.'+@id+' = WBT_DE_PARA.sCdItemWBC
WHERE
	WBT_DE_PARA.nCdTipoDocumento = '+@nCdTipoDocumento+'
AND
	'+@tabela+'.'+@id+' IS NULL
');

select '
SELECT
	'+@tabela+'.'+@id+',
	'+@tabela+'.'+@codigoMunicipio+',
	'+@nCdTipoDocumento+'
FROM
	'+@tabela+'
	WHERE '+@id+' NOT IN (
SELECT sCdItemWBC FROM WBT_DE_PARA WHERE nCdTipoDocumento = '+@nCdTipoDocumento+'
)
';