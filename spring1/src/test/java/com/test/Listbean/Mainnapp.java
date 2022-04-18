package com.test.Listbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainnapp {
	@SuppressWarnings("resource")
  public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Nameconfig.class);
		Namelist bean = context.getBean(Namelist.class);
		System.out.println(bean);
	}

}
