package com.developerinc.Spring6webapp.repositories;

import com.developerinc.Spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>                       {
}
