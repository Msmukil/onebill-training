package com.test.springannotationproblems;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Inkpen implements Pen {

	@Override
	public void write() {
		System.out.println("camlin");
		
	}
	

}
