package com.saeeds28.RestDemo.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		
	}
	
	public Alien removeAlien(int alienID) {
		return null;
	}

	public boolean updateAlien(Alien alien) {
		return false;
	}
	
	public Alien getAlien(int alienID) {
		return null;
	}
	
	public List<Alien> getAllAliens(){
		return null;
	}
}
