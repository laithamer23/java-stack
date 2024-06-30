package com.example.RenderingBooks.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.RenderingBooks.models.Book;
import com.example.RenderingBooks.services.BookService;

@Controller
	public class BooksController {
	    private final BookService bookService;
	    
	    public BooksController(BookService bookService) {
	        this.bookService = bookService;
	    }
	    
	    @RequestMapping("/books")
	    public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
//	        System.out.print(books);
	        return "/show.jsp";
	
}}
