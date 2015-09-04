package com.library.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.library.model.Book;

@Stateless(name="BookService")
public class BookService implements BookServiceLocal {
	
	@PersistenceContext(unitName="Library")
	private EntityManager em;
	
	private Book book;
	
	
	public void setEm(EntityManager em) {
		this.em = em;
	}



	public List<Book> queryAllBook() {
		
		return em.createNativeQuery("Book.findAll").getResultList();
	}
	
	public void addBook(String title, String author, String description, int quantity){
		book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setDescription(description);
		book.setQuantity(quantity);
	}

}
