//package com.library.service;
//
//import java.util.List;
//
//import org.easymock.EasyMockRule;
//import org.easymock.EasyMockSupport;
//import org.easymock.Mock;
//import org.easymock.TestSubject;
//import org.junit.Rule;
//import org.junit.Test;
//
//import com.library.model.Book;
//
//public class BookServiceQueryAllBookTest extends EasyMockSupport {
//
//	@Rule
//	public EasyMockRule rule = new EasyMockRule(this);
//	
//	@Mock
//	private BookServiceLocal collaborator;
//	
//	@TestSubject
//	private final BookService bookService = new BookService();
//	
//	@Test
//	public void queryAllBook(){
//		collaborator.queryAllBook();
//		replayAll();
//		bookService.addBook("Señor de los anillos", "Author", "description", 1);
//		verifyAll();
//	}
//	
//}
