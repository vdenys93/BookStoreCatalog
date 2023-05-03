package catalog.beans;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * May 2, 2023
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String genre;
	@Autowired
	private Author Author;
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Author getAuthor() {
		return Author;
	}
	
	public void setAuthor(Author author) {
		Author = author;
	}
	
	//Constructors
	public Book() {
		super();
	}
	
	public Book(String title,  String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	
	public Book(String title, String genre,  Author author) {
		super();
		this.title = title;
		this.genre = genre;
		Author = author;
	}
	
	public Book(long id, String title, String genre,  Author author) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		Author = author;
	}

	//Methods
	@Override
	public String toString() {
		return "Book [Id: " + id + ", Title: " + title + ", Genre: " + genre + ", " + Author + "]";
	}
	
	
}
