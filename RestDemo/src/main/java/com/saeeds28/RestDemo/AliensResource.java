package com.saeeds28.RestDemo;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("aliens") // will call this class whenever this url is specified
public class AliensResource {
	@GET	// this method will get called whenever a get request is generated
	@Produces(MediaType.APPLICATION_XML) // server returns a resource in an xml format
	public Alien getAlien() {
		System.out.println("getAlien method invoked");
		Alien alien = new Alien("Sam",100);
		return alien;
	}
}
