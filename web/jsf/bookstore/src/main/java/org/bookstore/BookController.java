package org.bookstore;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.bookstore.entity.Book;
import org.bookstore.repository.BookRepository;

@Named
@RequestScoped
public class BookController {

	@Inject
	BookRepository repository;
	
	private Book book = new Book();
	
	public String createBook() {
		repository.create(book);
		return "bookList.xhtml";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}


}
