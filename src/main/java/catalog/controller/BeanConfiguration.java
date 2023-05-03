package catalog.controller;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * May 2, 2023
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import catalog.beans.Author;
import catalog.beans.Book;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book();
		bean.setTitle("Nose");
		bean.setGenre("Adult Fiction");
		return bean;
	}
	
	@Bean
	public Author author() {
		Author bean = new Author("Nikolai", "Gogol");
		return bean;
	}
}
