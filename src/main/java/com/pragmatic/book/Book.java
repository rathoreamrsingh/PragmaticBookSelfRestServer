/**
 * 
 */
package com.pragmatic.book;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author amar
 *
 */
@XmlRootElement(name = "Book")
public class Book {
	private int id;
	private String writer;
	private int yearOfPublish;
	private int dateOfPublish;
	private int monthOfPublish;
	private String genere;

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
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}

	/**
	 * @param writer
	 *            the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}

	/**
	 * @return the yearOfPublish
	 */
	public int getYearOfPublish() {
		return yearOfPublish;
	}

	/**
	 * @param yearOfPublish
	 *            the yearOfPublish to set
	 */
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	/**
	 * @return the dateOfPublish
	 */
	public int getDateOfPublish() {
		return dateOfPublish;
	}

	/**
	 * @param dateOfPublish
	 *            the dateOfPublish to set
	 */
	public void setDateOfPublish(int dateOfPublish) {
		this.dateOfPublish = dateOfPublish;
	}

	/**
	 * @return the monthOfPublish
	 */
	public int getMonthOfPublish() {
		return monthOfPublish;
	}

	/**
	 * @param monthOfPublish
	 *            the monthOfPublish to set
	 */
	public void setMonthOfPublish(int monthOfPublish) {
		this.monthOfPublish = monthOfPublish;
	}

	/**
	 * @return the genere
	 */
	public String getGenere() {
		return genere;
	}

	/**
	 * @param genere
	 *            the genere to set
	 */
	public void setGenere(String genere) {
		this.genere = genere;
	}

}
