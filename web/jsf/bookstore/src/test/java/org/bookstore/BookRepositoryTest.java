package org.bookstore;


import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.bookstore.entity.Book;
import org.bookstore.repository.BookRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class BookRepositoryTest {

	
	@Inject
	BookRepository bookRepository;

	@Test
	public void create() throws Exception{
		assertEquals(Long.valueOf(2),bookRepository.countAll());
		
	}

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class)
				.addClass(BookRepository.class)
				.addClass(Book.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
				.addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml");
	}


}
