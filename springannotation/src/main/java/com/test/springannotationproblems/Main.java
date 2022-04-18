package com.test.springannotationproblems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ComponentScan(basePackages = {"com.test.springannotationproblems"})
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		Statinaryshop p = context.getBean(Statinaryshop.class);
		p.getPen().write();
	//	System.out.println(p);		
	}

}
