-- Conexao com Paradigma aqui
Select * from empresa WHERE lower( sNmEmpresa ) like '%previd%';
/*
NCDEMPRESA  SnRcNPEJ        SnMeMPRESA
   3	    46523239000147	Municipio de São Bernardo do Campo
11479	    59108100000189	FACULDADE DE DIREITO DE SAO BERNARDO DO CAMPO
11432	    00856424000152	INSTITUTO DE PREVIDENCIA E ASSISTENCIA ODONTOLOGICA LTDA
*/


select nCdEmpresa, count( nCdEmpresa ) tot from P_comprA_DIRETA WHERE NcDeMPRESA IN ( -1, 3, 11479, 11432 ) group by nCdempresa;
select nCdEmpresa, count( nCdEmpresa ) tot from P_PREGAO        WHERE NcDeMPRESA IN ( -1, 3, 11479, 11432 ) group by nCdempresa;
