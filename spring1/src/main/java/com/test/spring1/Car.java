package com.test.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
class Car {
	private String Brand;
	private String  model;
	private double price;
	@Autowired
	private Engine engine;
			
	
	

}
