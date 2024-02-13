INSERT INTO 
	WBT_DE_PARA 
	(
		sCdItemWBC, 
		sCdItemEmpresa, 
		nCdTipoDocumento
	)  
SELECT   
	EMPRESA.nCdEmpresa,   
	EMPRESA.sNrCnpj,   
	2  
FROM   
	EMPRESA   
WHERE 
	nCdEmpresa NOT IN 
	(
	SELECT 
		sCdItemWBC 
	FROM
		WBT_DE_PARA 
	WHERE
		nCdTipoDocumento = 2  
	)