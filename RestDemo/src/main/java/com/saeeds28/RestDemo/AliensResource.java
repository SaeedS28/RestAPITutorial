package com.saeeds28.RestDemo;

import javax.ws.rs.core.MediaType;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("aliens") // will call this class whenever this url is specified
public class AliensResource {
	AlienRepository repo = new AlienRepository();
	
	@GET	// this method will get called whenever a get request is generated
	@Produces(MediaType.APPLICATION_XML) // server returns a resource in an xml format
	public List<Alien> getAliens() {
		System.out.println("getAliens method invoked");
		return repo.getAliens();
	}
	
	@GET	// this method will get called whenever a get request is generated
	@Path("alien/{id}")	// id is now a placeholder
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // server returns a resource in an xml format
	// PathParam maps the placeholder to the method argument
	public Alien getAlien(@PathParam("id") int id) {
		return repo.getAlien(id);
	}
	
	@POST	// creating our own resource on the server
	@Path("alien")	// will be called when aliens/alien is visited
	// Client: use postman to type in the information in xml/json format
	public Alien createAlien(Alien a) {
		System.out.println(a);
		repo.create(a);
		return a;
	}
}
