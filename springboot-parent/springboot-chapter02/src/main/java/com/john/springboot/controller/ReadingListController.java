package com.john.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.john.springboot.condition.ConditionalBean;
import com.john.springboot.dal.ReadingListRepository;
import com.john.springboot.entity.Book;

@Controller
public class ReadingListController {
	
	@Autowired
	private ReadingListRepository readingListRepository;
	
	@Autowired
	private ConditionalBean conditionalBean;
	
	private static final String CURRENT_USER = "john";
	
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
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String testBean() {
		
		return conditionalBean.toString();
		
	}
}
