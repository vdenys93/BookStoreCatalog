package catalog.repository;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * May 2, 2023
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import catalog.beans.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
