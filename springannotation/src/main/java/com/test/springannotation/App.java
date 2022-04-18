package com.test.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				MobileConfiguration.class);
		Mobile bean = annotationConfigApplicationContext.getBean(Mobile.class);

		System.out.println(bean);
		annotationConfigApplicationContext.close();
	}
}
