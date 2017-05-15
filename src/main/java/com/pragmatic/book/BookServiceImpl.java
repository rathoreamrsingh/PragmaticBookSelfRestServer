/**
 * 
 */
package com.pragmatic.book;

import javax.ws.rs.core.Response;

import com.pragamtic.bookself.book.task.InsertBookDatatTask;
import com.pragamtic.bookself.book.task.RetrieveBookDataByIDTask;
import com.pragamtic.bookself.exception.PragmaticBookSelfException;
import com.pragamtic.bookself.result.PragmaticBookSelfResult;
import com.pragamtic.bookself.task.core.PragmaticBookselfTask;
import com.pragmatic.bookself.book.BookEntity;
import com.pragmatic.bookself.session.PragmaticBookselfSession;
import com.pragmatic.bookself.storagecontext.StorageContext;

/**
 * @author amar
 *
 */
public class BookServiceImpl implements BookService {

	/**
	 * 
	 */
	public BookServiceImpl() {

	}

	@Override
	public Book getBookById(int id) {
		Book book = new Book();
		try {
			PragmaticBookselfTask<BookEntity> retrive = new RetrieveBookDataByIDTask(id);
			PragmaticBookselfSession session = new PragmaticBookselfSession();
			StorageContext context = new StorageContext();

			PragmaticBookSelfResult<BookEntity> result = retrive.executeTask(session, context);
			BookEntity bookEntity = result.getResultedObject();
			book = Book.parseBookEntity(bookEntity);
		} catch (PragmaticBookSelfException pbse) {
			pbse.printStackTrace();
		}

		return book;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragmatic.book.BookService#addBoook(com.pragmatic.book.Book)
	 */
	@Override
	public Response addBoook(Book book) {
		try{
		PragmaticBookselfTask<Integer> insertBookDatatTask = new InsertBookDatatTask(Book.parseBook(book));
		PragmaticBookselfSession session = new PragmaticBookselfSession();
		StorageContext context= new StorageContext();
		insertBookDatatTask.executeTask(session, context);
	} catch (PragmaticBookSelfException ex){
		
		ex.printStackTrace();
	}
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragmatic.book.BookService#updateBook(com.pragmatic.book.Book)
	 */
	@Override
	public Response updateBook(Book book) {

		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragmatic.book.BookService#deleteBook(int)
	 */
	@Override
	public Response deleteBook(int id) {

		return Response.ok().build();
	}
}
