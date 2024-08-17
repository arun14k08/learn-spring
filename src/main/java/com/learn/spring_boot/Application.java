package com.learn.spring_boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Dev obj = (Dev) context.getBean("dev");
		System.out.println(obj.getAge());
		obj.build();
	}

}
