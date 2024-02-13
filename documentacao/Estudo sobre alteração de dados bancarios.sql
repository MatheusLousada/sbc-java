
--03541616000168 - 25624 chamado 291771 ( não troca razão social : de CRYSTAL CLEAR  para DUCTBUSTERS 
--78515210000100 - 30317 chamado 296072 ( Atualizar dados bancarios banco 077 CORRETO: Banco[077] Agencia[0001- ] Conta [9820309.6]
--                                                                            Alterado: Banco[341] Agencia[0001- ] Conta [98203.6]
--                 41258 chamado 296375 (Fornecedor Willian Vinicius Damásio, alterar o digito X para 0 da mensagem ERRO VERIFIQUE, DIGITO INVALIDO. 

-- Paradigma
SELECT * FROM BANCO INNER JOIN EMPRESA_BANCO ON BANCO.nCdBanco = EMPRESA_BANCO.nCdBanco  WHERE EMPRESA_BANCO.nCdEmpresa = 10048;

-- ORCOM
SELECT t.usuario, t.data_reg, t.data_mov, t.nome_arquivo, t.linha, t.registro FROM orcom.tab_transparencia t WHERE t.nome_arquivo = 'TRANS_DOTACAO' ORDER BY t.linha
;
--update orcom.tab_transparencia set data_mov = 20230210 WHERE data_mov = 10022023; commit;

   
--Ficha de fornecedores
WITH f as ( Select ATIVOC, ATIVOO, BAIRCORR, BAIRMATRIZ, CARGRESP, CCORRENTE, CEI, CEPCORR, CEPCORRC, CEPLOG, CEPLOGC, CEPMATRIZ, CEPMATRIZC, CGC_CPF, 
                   CIDCORR, CIDMATRIZ, COD_AGEN, COD_BCO, CODOCUP, CODRET, COMPCORR, COMPMATRIZ, CPF_RESPON, CPFINDIV, CTSOCDTREG, CTSOCIALNU, DATA_ADD, 
                   DATA_CHG, DDD, DDDC, DESATIVADO, DESC_SEC, DIGITO, DIGITOAG, DIGITOAGCT, DIGITOCT, DIGITOCT2, DT_BAL, DT_CGC, DT_COM, DT_DEB, DT_EST,
                   DT_FAL, DT_IMOB, DT_MUN, DT_PAT, DT_QUI, DT_REG, DT_UNI, EMAILCORR, ENCAMINHA, ESTADO, FAXCORR, FAXMATRIZ, FAXN, FAXNC, FLAG_ADD,
                   FLAG_CHG, INSC_EST, INSC_MUN, N_PESQ, NIT, NUM_CONTA, NUMCORR, NUMMATRIZ, OCORRC, OCORRO, OCUPACAO, ORD_TFORN, PIS, PROCESSO, R_SOCIAL,
                   R_SOCIAL2, RG, RUACORR, RUAMATRIZ, SENHA, SENHA1, SIGLAPROC, SITECORR, STA_ATUAL, STA_AUDESF, STA_AUDESP, STA_AUDESR, SUFCORR, SUFMATRIZ, 
                   SUSPEC,  SUSPEO, TEL1, TEL1C, TEL1CORR, TEL1MATRIZ, TEL2, TEL2C, TEL2CORR, TEL2MATRIZ, TIP_CONTA, TIPOLOG, TIPOLOGC, TIPOPROC, TP_FC, 
                   TP_FORN, TP_IDENT, ULTALTCTNU, UNIDADE_1, USUARIO, DT_TRABALHISTA, TIPO_CONTA, GRANDES, DT_XML, IRREGULAR, MOTIVO, RETENCAO, ALIQUOTA, 
                   GRANDES_ORD, ME_EPP, OPC_IR, EMAILCORR2, WBC, APOSENTADO,DATA_NASCIMENTO, TOMADOR_MATRICULA, TOMADOR_DTINI, TOMADOR_DTFIM, TOMADOR_NOMEORD,
                   TOMADOR_CARGOORD, TOMADOR_NOMESEC, TOMADOR_CARGOSEC, DT_FGTS, SIMPLES, MEI, TIPO_EMPRESA, R_SOCIAL_PRODIGI, ORD_FAVOR
              FROM orcom.tforn 
             WHERE ord_tforn = 
                 -- 40029 ) -- 06182957000182
                 -- 36760 ) -- REMA 43776447000160 
                 25624 ) -- 03541616000168 OK trocou a razao social, mas não o NOME DE PESQUISA
                 --30317 ) -- 78515210000100
             
Select linha from (
             select 1 pos, '<html>Buscando os dados do fornecedor [<span style="background-color:yellow;">' || f.ord_tforn ||
                           '</span>] na tabela TFORN...</html>' linha
FROM f union Select 2,     '<html>Fornecedor: <span style="background-color: rgb(0, 0, 120); color:white">' || f.R_social || '</span></html>' linha
FROM f union Select 2.1,     '<html>Nome Pesquisa: <span style="background-color: rgb(0, 0, 120); color:RED">' || f.n_pesq || '</span></html>' linha
FROM f union select 3,     '<html><span style="background-color: rgb(102, 255, 0);">Matriz </span>[' ||  f.TIPOLOG  || ' ' || f.RUAMATRIZ || ', ' ||
                           f.nummatriz|| ' - ' || f.compmatriz || ' - ' || f.BAIRMATRIZ || ' - ' || f.CIDMATRIZ  || ' - ' || f.SUFMATRIZ  ||
                           '], CEP [' || f.CEPLOG   || ']' as c
FROM f union select 4,     '       (' || DDD || ')' || TEL1  || ' (' || DDD  || ') ' || TEL2  || ' '
from f union select 5,     '<html><span style="background-color: rgb(102, 255, 0);">Corresp</span>[' || f.TIPOLOGC || ' ' || f.RUACORR || ', ' || 
                           f.numcorr || ' - '  || f.compcorr || ' - ' || f.BAIRCORR || 
                           ' - ' || f.CIDCORR  || ' - ' || f.SUFCORR ||'], CEP [' || f.CEPLOGC  || ']'  as e
FROM f union select 6,     '       ('|| DDDC || ')' || TEL1C || ' (' || DDDC || ') ' || TEL2C || ' ' || TEL2CORR|| ' ' || TEL2MATRIZ ||
                           TEL1MATRIZ|| ' ' || TEL1CORR|| ' '
FROM f union SELECT 7,     '<html>Tipo [<span style="background-color:blue; color:yellow;">' ||
                           decode( TP_FC, 'F', 'Fornecedor', 'C', 'Credor' ) || '</span>]</html>' 
FROM f union SELECT 8,    '<html>Banco[<span style="background-color:blue; color:yellow;">' || COD_BCO || '</span>] ' ||
                          'Agencia[<span style="background-color:blue; color:yellow;">' || COD_AGEN || '-' ||DIGITOAG ||'</span>]' || 
                           
                          ' Conta [<span style="background-color:blue; color:yellow;">'|| NUM_CONTA || '.' || DIGITOCT ||']</span></html>'
FROM f union SELECT 9,    '<html>Email[<span style="background-color: rgb(0, 0, 120); color:white;">' || EMAILCORR || '</span>] ' ||
                           'Email 2[<span style="background-color: rgb(0, 0, 120); color:white;">' || EMAILCORR2 ||'</span>]</html>'
FROM f union SELECT 10, '<html>Ins Estadual[<span style="background-color: rgb(0, 0, 120); color:white;">' ||INSC_EST || '</span>] ' ||
                          'Ins Muncipal[<span style="background-color: rgb(0, 0, 120); color:white;">' || INSC_MUN ||'</span>]</html>'
FROM f union select 11, '<html>CNPJ <span style="background-color: rgb(10, 0, 120); color:YELLOW;">' || CGC_CPF  || '</span> CPF '|| CPFINDIV ||  	'  R_SOCIAL_PRODIGI ' || R_SOCIAL_PRODIGI ||'</html>'
from f

)
;
Select ord_TFORN, r_social, CGC_CPF, cod_bco, NUM_CONTA from orcom.tforn    WHERE ord_tforn IN (
                  40029,  -- 06182957000182 -- Speedy
                  36760, -- REMA 43776447000160 
                 25624, -- 03541616000168 OK trocou a razao social, mas não o NOME DE PESQUISA
                 30317 ) -- 78515210000100 -- Controller
;
update orcom.tforn SET cod_bco =  '341', num_conta= '00001' WHERE ord_tforn = 40029; commit;  -- 06182957000182 -- Speedy
update orcom.tforn SET cod_bco =  '341', num_conta= '00001', r_social = ' TESTE ALEXANDRE' WHERE ord_tforn = 36760; commit;-- REMA 43776447000160 
update orcom.tforn SET cod_bco =  '341', num_conta= '00001' WHERE ord_tforn = 25624; commit;-- 03541616000168 OK trocou a razao social, mas não o NOME DE PESQUISA
update orcom.tforn SET cod_bco =  '341', num_conta= '00001' WHERE ord_tforn = 30317; commit;-- 78515210000100 -- Controller
;


Select * from orcom.contr WHERE ord_contr = 'CHGFORN99988' ;
--UPDATE orcom.contr SET inform_1  = 'S' WHERE ord_contr = 'CHGFORN99988' ; commit;
--UPDATE orcom.contr SET inform_1  = 'N' WHERE ord_contr = 'CHGFORN99988' ; commit;