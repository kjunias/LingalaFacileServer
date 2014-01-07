package com.kjunias.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/lingala")
public class LingalaWordService {
 
	@GET
	@Path("/{definition}")
	public Response getMsg(@PathParam("definition") String definition) {
 
		String output = "Jersey say : " + definition;
 
		return Response.status(200).entity(output).build();
 
	}
 
}
