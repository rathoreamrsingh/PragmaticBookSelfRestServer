/**
 * 
 */
package com.pragmatic.book;

import javax.ws.rs.core.Response;

/**
 * @author amar
 *
 */
public class BookServiceImpl implements BookService {
	@Override
	public String getBookById(int id) {
		return "Hello World";
	}
}
