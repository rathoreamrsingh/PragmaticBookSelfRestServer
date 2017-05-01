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
	public Book getBookById(int id) {
		Book book = new Book();
		book.setId(id);
		book.setDateOfPublish(21);
		book.setGenere("Drama");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De");
		book.setYearOfPublish(2013);
		return book;
	}
}
