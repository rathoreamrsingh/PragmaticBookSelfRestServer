/**
 * 
 */
package com.pragmatic.book;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

/**
 * @author amar
 *
 */
public class BookServiceImpl implements BookService {
	public static List<Book> bookList = new ArrayList<Book>();

	/**
	 * 
	 */
	public BookServiceImpl() {

	}

	static {
		Book book = new Book();
		book.setId(1);
		book.setDateOfPublish(21);
		book.setGenere("Drama");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De");
		book.setYearOfPublish(2013);

		bookList.add(book);

		book = new Book();
		book.setId(2);
		book.setDateOfPublish(21);
		book.setGenere("Drama2");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De2");
		book.setYearOfPublish(2013);
		bookList.add(book);

		book = new Book();
		book.setId(3);
		book.setDateOfPublish(21);
		book.setGenere("Drama3");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De3");
		book.setYearOfPublish(2013);
		bookList.add(book);

		book = new Book();
		book.setId(4);
		book.setDateOfPublish(21);
		book.setGenere("Drama4");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De4");
		book.setYearOfPublish(2013);
		bookList.add(book);

		book = new Book();
		book.setId(5);
		book.setDateOfPublish(21);
		book.setGenere("Drama5");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De5");
		book.setYearOfPublish(2013);
		bookList.add(book);

		book = new Book();
		book.setId(6);
		book.setDateOfPublish(21);
		book.setGenere("Drama6");
		book.setMonthOfPublish(5);
		book.setWriter("Sobha De6");
		book.setYearOfPublish(2013);
		bookList.add(book);

	}

	@Override
	public Book getBookById(int id) {
		int counter = 0;

		for (Book book : BookServiceImpl.bookList) {
			if (book.getId() == id) {
				break;
			}
			counter++;
		}

		// if(counter >= BookServiceImpl.bookList.size())
		// {
		// return null;
		// }
		// else
		// {
		// return BookServiceImpl.bookList.get(counter);
		// }

		/**
		 * We can follow the above approach also but due to code readiability
		 * aspect the below one is good for this scenario
		 */

		return counter >= BookServiceImpl.bookList.size() ? null : BookServiceImpl.bookList.get(counter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragmatic.book.BookService#addBoook(com.pragmatic.book.Book)
	 */
	@Override
	public Response addBoook(Book book) {
		if (book != null) {
			BookServiceImpl.bookList.add(book);
		} else {
			Response.notModified().build();
		}

		return Response.ok(book).build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragmatic.book.BookService#updateBook(com.pragmatic.book.Book)
	 */
	@Override
	public Response updateBook(Book book) {
		int counter = 0;
		if (book == null)
			return Response.notModified().build();
		for (Book b : BookServiceImpl.bookList) {
			if (b.getId() == book.getId()) {
				break;
			}
			counter++;
		}

		if (counter >= BookServiceImpl.bookList.size()) {
			return Response.notModified().build();
		}

		BookServiceImpl.bookList.remove(counter);
		BookServiceImpl.bookList.add(book);

		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragmatic.book.BookService#deleteBook(int)
	 */
	@Override
	public Response deleteBook(int id) {
		int counter = 0;
		for (Book book : BookServiceImpl.bookList) {
			if (book.getId() == id) {
				break;
			}
			counter++;
		}

		if (counter >= BookServiceImpl.bookList.size()) {
			return Response.notModified().build();
		}

		BookServiceImpl.bookList.remove(counter);

		return Response.ok().build();
	}
}
