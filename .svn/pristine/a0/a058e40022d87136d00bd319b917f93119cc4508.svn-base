--produtos duplicados
select sCdProdutoEmpresa,count(sCdProdutoEmpresa) from produto 
group by sCdProdutoEmpresa order by count(sCdProdutoEmpresa)  desc;

--mostra produtos sem associação de/para
select nCdProduto, sCdProdutoEmpresa, sDsProduto, sCdItemWBC, sCdItemEmpresa from produto 
left join WBT_DE_PARA on produto.nCdProduto = sCdItemWBC where nCdTipoDocumento = 3 
and (sCdItemEmpresa is null or sCdItemWBC is null);

--mostra produto sem associação de/para
select nCdProduto, sCdProdutoEmpresa, sDsProduto, sCdItemWBC, sCdItemEmpresa from produto 
left join WBT_DE_PARA on sCdProdutoEmpresa = 
sCdItemEmpresa where nCdTipoDocumento = 3 and nCdProduto = 2905;

