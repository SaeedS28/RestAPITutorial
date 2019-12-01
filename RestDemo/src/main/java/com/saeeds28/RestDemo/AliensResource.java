package com.saeeds28.RestDemo;

import javax.ws.rs.core.MediaType;

import com.saeeds28.RestDemo.DAO.AlienDAO;
import com.saeeds28.RestDemo.Model.Alien;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("aliens") // will call this class whenever this url is specified
public class AliensResource {
	AlienDAO repo = new AlienDAO();
	
	@GET	// this method will get called whenever a get request is generated
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
	public List<Alien> getAliens() {
		System.out.println("getAliens method invoked");
		return repo.getAllAliens();
	}
	
	@GET	// this method will get called whenever a get request is generated
	@Path("alien/{id}")	// id is now a placeholder
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	// PathParam maps the placeholder to the method argument
	public Alien getAlien(@PathParam("id") int id) {
		return repo.getAlien(id);
	}
	
	@POST	// creating our own resource on the server
	@Path("alien")	// will be called when aliens/alien is visited
	// Client: use postman to type in the information in xml/json format
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien createAlien(Alien a) {
		System.out.println(a);
		repo.addAlien(a);
		return a;
	}
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public String updateAlien(Alien a) {
		boolean updated = repo.updateAlien(a);
		if(updated==true) {
			return "Alien updated successfully";
		}
		return "No existing object matched the primary key. Nothing updated";
	}
	
	
}
