package com.example.RenderingBooks.controller;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RenderingBooks.models.Book;
import com.example.RenderingBooks.services.BookService;

@RestController
public class BookController {
	 private final BookService bookService ;
	    public BookController(BookService bookService){
	        this.bookService = bookService;
	    }
	 @RequestMapping("/api/books")
  public List<Book> index() {
     return bookService.allBooks();
 }

 @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
 public Book update(
 	@PathVariable("id") Long id, 
 		@RequestParam(value="title") String title, 
  		@RequestParam(value="description") String desc, 
  		@RequestParam(value="language") String lang,
  		@RequestParam(value="pages") Integer numOfPages) {
  	Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
      return book;
 }
  
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
  public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id);
  }

 @RequestMapping(value="/api/books", method=RequestMethod.POST)
  public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
      Book book = new Book(title, desc, lang, numOfPages);
     return bookService.createBook(book);
  }
   @RequestMapping("/books/{id}")
   public String ShowBooks(@PathVariable("id") Long id, Model model) {
  	 Book TheBook = bookService.findBook(id);
  	String title= TheBook.getTitle();
  	String description=TheBook.getDescription();
  	String language=TheBook.getLanguage();
	Integer pages = TheBook.getNumberOfPages();
  	model.addAttribute("title",title);
  	model.addAttribute("description",description);
  	model.addAttribute("language",language);
  	model.addAttribute("pages",pages);
 	return "true";
  	
   }
   


}
