package com.saeeds28.RestDemo;

import java.util.ArrayList;
import java.util.List;

// mock database class
public class AlienRepository {

	private List<Alien> aliens;
	
	public AlienRepository() {
		Alien alien = new Alien(1,"Sam",100);
		Alien alien2 = new Alien(2,"Saad", 69420);
		aliens = new ArrayList<>();
		aliens.add(alien);
		aliens.add(alien2);
	}
	
	public List<Alien> getAliens(){
		return this.aliens;
	}
	
	public Alien getAlien(int id) {
		for(Alien a: aliens) {
			if(a.getId()==id) {
				return a; 
			}
		}
		return null;
	}

	public void create(Alien a) {
		aliens.add(a);
	}
}
