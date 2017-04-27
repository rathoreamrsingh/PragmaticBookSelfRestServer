/**
 * 
 */
package com.pragmatic.book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Produces({ "application/xml", "application/json" })
public interface BookService {
	@GET
	@Path("/books/{id}/")
	public Response getBookById(@PathParam("id") int id);
}
