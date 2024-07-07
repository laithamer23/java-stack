package com.example.BookClub.Repo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.BookClub.models.Book;

public interface BookRepo  extends CrudRepository<Book, Long> {
	List<Book> findAll();
}
