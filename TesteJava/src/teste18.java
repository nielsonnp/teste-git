
public class teste18 {
	
	 EntityManager manager = new JPAUtil().getEntityManager(); 



	 Conta conta = new Conta(); 

	 conta.setId(1); 



	 Query query = manager 

	  .createQuery('select m from Movimentacao m where m.conta=:pConta' + ' and

	 m.tipoMovimentacao=:pTipo'); 



	 query.setParameter('pConta', conta); 

	 query.setParameter('pTipo', TipoMovimentacao.ENTRADA); 



	 List<Movimentacao> movimentacoes = query.getResultList(); 

	 manager.close();

}
