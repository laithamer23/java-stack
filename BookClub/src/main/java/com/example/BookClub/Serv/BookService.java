package com.example.BookClub.Serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookClub.Repo.BookRepo;
import com.example.BookClub.models.Book;

@Service
public class BookService {
	@Autowired
	BookRepo bookrepo;
	
	
    public BookService(BookRepo bookrepo) {
        this.bookrepo = bookrepo;
    }
    
    public List<Book> allBooks() {
        return bookrepo.findAll();
    }
    
    public Book createBook(Book b) {
        return bookrepo.save(b);
    }
    
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookrepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
