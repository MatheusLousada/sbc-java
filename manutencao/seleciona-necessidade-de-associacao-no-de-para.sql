--EMPRESA
--DECLARE @nCdTipoDocumento AS INT = 2;
--DECLARE @tabela AS VARCHAR(255) = 'EMPRESA';
--DECLARE @id AS VARCHAR(255) = 'nCdEmpresa';

--PRODUTO
--DECLARE @nCdTipoDocumento AS INT = 3;
--DECLARE @tabela AS VARCHAR(255) = 'PRODUTO';
--DECLARE @id AS VARCHAR(255) = 'nCdProduto';

--CLASSE_PRODUTO
--DECLARE @nCdTipoDocumento AS INT = 4;
--DECLARE @tabela AS VARCHAR(255) = 'CLASSE_PRODUTO';
--DECLARE @id AS VARCHAR(255) = 'nCdClasse';

--UNIDADE_MEDIDA
--DECLARE @nCdTipoDocumento AS INT = 5;
--DECLARE @tabela AS VARCHAR(255) = 'UNIDADE_MEDIDA';
--DECLARE @id AS VARCHAR(255) = 'nCdUnidadeMedida';

--MOEDA
--DECLARE @nCdTipoDocumento AS INT = 10;
--DECLARE @tabela AS VARCHAR(255) = 'MOEDA';
--DECLARE @id AS VARCHAR(255) = 'nCdMoeda';

--TIPO FRETE
--DECLARE @nCdTipoDocumento AS INT = 11;
--DECLARE @tabela AS VARCHAR(255) = 'FRETE';
--DECLARE @id AS VARCHAR(255) = 'nCdFrete';

--USUARIO
--DECLARE @nCdTipoDocumento AS INT = 12;
--DECLARE @tabela AS VARCHAR(255) = 'USUARIO';
--DECLARE @id AS VARCHAR(255) = 'sCdUsuario';

--CONDICAO_PAGAMENTO
--DECLARE @nCdTipoDocumento AS INT = 13;
--DECLARE @tabela AS VARCHAR(255) = 'CONDICAO_PAGAMENTO';
--DECLARE @id AS VARCHAR(255) = 'nCdCondicaoPagamento';

--PRAZO_ENTREGA
--DECLARE @nCdTipoDocumento AS INT = 21;
--DECLARE @tabela AS VARCHAR(255) = 'PRAZO_ENTREGA';
--DECLARE @id AS VARCHAR(255) = 'nCdPrazoEntrega';

--????????? - Não consegui relacionar este item
--DECLARE @nCdTipoDocumento AS INT = 180;
--DECLARE @tabela AS VARCHAR(255) = '?????????';
--DECLARE @id AS VARCHAR(255) = '?????????';

EXEC('
SELECT
	'+@tabela+'.'+@id+'
FROM
	'+@tabela+'
	WHERE '+@id+' NOT IN (
SELECT sCdItemWBC FROM WBT_DE_PARA WHERE nCdTipoDocumento = '+@nCdTipoDocumento+'
)
')