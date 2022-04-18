package com.test.springannotationproblems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class Statinaryshop {
	@Value(value = "harypotter")
	String bookname;
	@Value(value = "pencil")
	String things;
	@Autowired
	@Qualifier
	
	Pen pen;

}
