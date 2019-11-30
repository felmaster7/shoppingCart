package br.edu.infnet.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.infnet.model.Produto;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ProdutoEjb {

	@PersistenceContext(unitName = "shoppingCart")
	private EntityManager em;
	
	public Produto add(Produto produto) {
		em.persist(produto);
		em.flush();
		return produto;
	}
	
	
}
