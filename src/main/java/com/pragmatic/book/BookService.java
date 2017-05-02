/**
 * 
 */
package com.pragmatic.book;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
/*
 * this is having capability to proivide both xml as well as json 
 @Produces({ "application/json", "application/xml" })
*/

/*
 * this can only produce json 
 */
@Produces({ "application/json" })
public interface BookService {
	@GET
	@Path("/books/{id}/")
	public Book getBookById(@PathParam("id") int id);
	
	@POST
	@Path("/book")
	public Response addBoook(Book book);
	
	@PUT
	@Path("/book")
	public Response updateBook(Book book);
	
	@DELETE
	@Path("/book/{id}/")
	public Response deleteBook(int id);
}
