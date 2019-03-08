package com.john.springboot.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.john.springboot.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
	
}
