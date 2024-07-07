package com.example.BookClub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.BookClub.Serv.BookService;
import com.example.BookClub.Serv.UserService;
import com.example.BookClub.models.Book;
import com.example.BookClub.models.User;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@Autowired
	private UserService userservice;

	@GetMapping("/home")
	public String index( Model model,HttpSession session) {
		model.addAttribute("books", bookService.allBooks());
		long thisid =  (long) session.getAttribute("user");
		User thisuser = userservice.getUserByID(thisid);
		model.addAttribute("user", thisuser);
		return "book.jsp";
	}

	@PostMapping(value = "/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "newbook.jsp";
		} else {
			User thisuser = userservice.getUserByID((long) session.getAttribute("user"));
			book.setUser(thisuser);
			bookService.createBook(book);
			return "redirect:/home";
		}
	}

	@GetMapping("/books/{id}")
	public String show(@ModelAttribute("id") Long id) {
		Book book = bookService.findBook(id);
		return "book.jsp";
	}

	@GetMapping("/newbook")
	public String newbook(@ModelAttribute("book") Book book) {
		return "newbook.jsp";
	}


	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") long id,Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("Book", book);
		return "show.jsp";
	}
	
}
