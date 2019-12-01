package com.saeeds28.RestDemo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.saeeds28.RestDemo.Model.Alien;

/**
 * Basic CRUD operations associated with the Alien POJO
 * 
 * @author Saad
 *
 */
public class AlienDAO {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public AlienDAO() {
		emf = Persistence.createEntityManagerFactory("RestDemo");
		em = emf.createEntityManager();
	}
	
	public void addAlien(Alien alien) {
		em.getTransaction().begin();
		em.persist(alien);
		em.getTransaction().commit();
	}
	
	public Alien removeAlien(int alienID) {
		Alien alien = em.find(Alien.class, alienID);
		if(alien != null) {
			em.getTransaction().begin();
			em.remove(alien);
			em.getTransaction().commit();
		}
		return alien;
	}

	public boolean updateAlien(Alien alien) {
		Alien managed = em.find(Alien.class, alien.getId());
		if(managed != null) {
			em.getTransaction().begin();
			managed.setName(alien.getName());
			managed.setSkillPoints(alien.getSkillPoints());
			em.getTransaction().commit();
			return true;
		}
		return false;
	}
	
	public Alien getAlien(int alienID) {
		Alien alien = em.find(Alien.class, alienID);		
		return alien;
	}
	
	public List<Alien> getAllAliens(){
		Query query = em.createQuery(
				   "SELECT a FROM Alien a", Alien.class);
		
		@SuppressWarnings("unchecked")
		ArrayList<Alien> toReturn = (ArrayList<Alien>) query.getResultList();
		return toReturn;
	}

	public List<Alien> removeAllAliens() {
		List<Alien> removeAll = getAllAliens();
		em.getTransaction().begin();
		for(int i = 0; i < removeAll.size(); i++) {
			em.remove(removeAll.get(i));
		}
		em.getTransaction().commit();
		return removeAll;
	}
}
