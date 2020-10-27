package sn.forage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Users;

public class Userforage implements IUSERS {

	private EntityManager em;
	
	public Userforage() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("senforagePu");
		em = emf.createEntityManager();
	}
	@Override
	public int add(Users users) {
		try {
			em.getTransaction().begin();
			em.persist(users);
			em.getTransaction().commit();
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			
		}
		
		
	}

}
