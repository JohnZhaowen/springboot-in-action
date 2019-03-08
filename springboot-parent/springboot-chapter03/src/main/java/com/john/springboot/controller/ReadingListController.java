package com.john.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.john.springboot.dal.ReadingListRepository;
import com.john.springboot.entity.Book;

@Controller
public class ReadingListController {
	
	@Autowired
	private ReadingListRepository readingListRepository;
	
	
	private static final String CURRENT_USER = "john";
	
	@RequestMapping(value="/errorTest", method=RequestMethod.GET)
	public String errorTest(Model model) {
		
		int i = 1/0;
		return "readingList";
	}
	@RequestMapping(value="/readingList", method=RequestMethod.GET)
	public String readersBooks(Model model) {
		
		List<Book> readingList = readingListRepository.findByReader(CURRENT_USER);
		if (readingList != null) {
			model.addAttribute("books", readingList);
		}
		return "readingList";
	}
	
	@RequestMapping(value="/readingList", method=RequestMethod.POST)
	public String addToReadingList(Book book) {
		book.setReader(CURRENT_USER);
		readingListRepository.save(book);
		return "redirect:/readingList";
		
	}
	
}
