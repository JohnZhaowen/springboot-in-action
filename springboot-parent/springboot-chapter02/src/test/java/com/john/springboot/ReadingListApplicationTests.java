package com.john.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.john.springboot.condition.ConditionalBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadingListApplicationTests {
	
//	@Autowired
//	private ConditionalBean bean;

	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void testCondition() {
		
//		if (bean != null) {
//			System.out.println("有..");
//		} else {
//			System.out.println("没有..");
//		}
	}

}
