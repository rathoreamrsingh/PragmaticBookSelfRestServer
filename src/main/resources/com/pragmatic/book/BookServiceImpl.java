/**
 * 
 */
package com.pragmatic.book;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author amar
 *
 */
public class BookServiceImpl implements BookService {
	@Override
	public Response getBookById(int id) {
		return Response.ok();
	}
}
