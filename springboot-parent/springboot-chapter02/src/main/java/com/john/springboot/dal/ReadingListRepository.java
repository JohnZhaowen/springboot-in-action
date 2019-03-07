package com.john.springboot.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.john.springboot.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}
