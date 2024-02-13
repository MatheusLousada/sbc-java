INSERT INTO 
	WBT_DE_PARA 
	(
		sCdItemWBC, 
		sCdItemEmpresa, 
		nCdTipoDocumento
	)  
SELECT   
	USUARIO.sCdUsuario,   
	USUARIO.sCdUsuario,   
	12  
FROM   
	USUARIO   
WHERE 
	sCdUsuario NOT IN 
	(
	SELECT 
		sCdItemWBC 
	FROM 
		WBT_DE_PARA 
	WHERE 
		nCdTipoDocumento = 12  
	)