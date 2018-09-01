package org.bookstore;

import java.util.Arrays;
import java.util.List;

import org.bookstore.entity.Book;
import org.bookstore.repository.BookRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class BookBean {
	
	@Inject
	BookRepository repository;
	
	private List<String> items = Arrays.asList("ala","ma","kota");
	/*
	private List<Book> books = Arrays.asList(
		new Book("book1","author1"),
		new Book("book2","author2"),
		new Book("book3","author3")
	);
	*/
	
	public String getTest() {
		return "osaigjoj";
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public List<Book> getBooks() {
//		return books;
		return repository.findAll();
	}

	/*
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	*/

}