package com.developerinc.Spring6webapp.repositories;

import com.developerinc.Spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long > {
}
