package com.john.springboot.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Conditional(JdbcTemplateCondition.class)
@Service
public class ConditionalBean {	
	
	public String getTestMsg() {
		return "this bean is created.";
	}
}
