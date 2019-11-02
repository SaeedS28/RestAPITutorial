package com.saeeds28.RestDemo;

import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("aliens") // will call this class whenever this url is specified
public class AliensResource {
	AlienRepository repo = new AlienRepository();
	
	@GET	// this method will get called whenever a get request is generated
	@Produces(MediaType.APPLICATION_XML) // server returns a resource in an xml format
	public List<Alien> getAlien() {
		System.out.println("getAlien method invoked");
		return repo.getAliens();
	}
	
	
	@POST	// creating our own resource in the server
	@Path("alien")	// will be called when aliens/alien is visited
	// Client: use postman to type in the information in xml/json format
	public Alien createAlien(Alien a) {
		System.out.println(a);
		repo.create(a);
		return a;
	}
}
