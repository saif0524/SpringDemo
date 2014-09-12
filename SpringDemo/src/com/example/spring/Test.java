package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee empl  = (Employee) context.getBean("employee");
		empl.show();
		
		/* 
		ApplicationContext context = new ClassPathXmlApplicationContext("appCiList.xml");
		Question quest = (Question) context.getBean("quest");
		quest.displayResult();*/
	}

}
