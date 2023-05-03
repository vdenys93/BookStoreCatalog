package catalog.controller;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * May 2, 2023
 */



import catalog.beans.Book;
import catalog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "index";
    }

    @GetMapping("/addBook")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "input";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookRepository.save(book);
        return "redirect:/viewAllBooks";
    }

    @GetMapping("/editBook/{id}")
    public String showEditBookForm(@PathVariable("id") long id, Model model) {
        Optional<Book> book = bookRepository.findById(id);
        model.addAttribute("book", book.orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id)));
        return "input";
    }

    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") long id) {
        bookRepository.deleteById(id);
        return "redirect:/viewAllBooks";
    }
    @GetMapping("/viewAllBooks")
    public String viewAllBooks(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "results";
    }
}

