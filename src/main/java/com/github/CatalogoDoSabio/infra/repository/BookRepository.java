package com.github.CatalogoDoSabio.infra.repository;

import com.github.CatalogoDoSabio.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Long, Book> {

}
