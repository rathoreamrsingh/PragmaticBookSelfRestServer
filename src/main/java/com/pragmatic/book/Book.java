/**
 * 
 */
package com.pragmatic.book;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.pragmatic.bookself.book.BookEntity;

/**
 * @author amar
 *
 */
@XmlRootElement(name = "Book")
public class Book {
	private int id;
	private String bName;
	private int authorId;
	private int rating;
	private Date pubDate;

	public Book() {

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}

	/**
	 * @param bName
	 *            the bName to set
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}

	/**
	 * @return the authorId
	 */
	public int getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId
	 *            the authorId to set
	 */
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the pubDate
	 */
	public Date getPubDate() {
		return pubDate;
	}

	/**
	 * @param pubDate
	 *            the pubDate to set
	 */
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * This method helps in coverting BookEntity {@link BookEntity} to Book
	 * {@link Book}
	 * 
	 * @param bookentity
	 * @return
	 */
	public static Book parseBookEntity(BookEntity bookentity) {
		Book book = new Book();
		book.setId(bookentity.getId());
		book.setbName(bookentity.getB_name());
		book.setAuthorId(bookentity.getAuthor_id());
		book.setPubDate(bookentity.getPub_date());
		book.setRating(bookentity.getRating());

		return book;
	}
	
	public static BookEntity parseBook(Book book){ 
		BookEntity bookEntity = new BookEntity();
		bookEntity.setId(book.getId());
		bookEntity.setAuthor_id(book.getAuthorId());
		bookEntity.setB_name(book.getbName());
		bookEntity.setPub_date(book.getPubDate());
		bookEntity.setRating(book.getRating());
		return bookEntity; 
		
	}

}
