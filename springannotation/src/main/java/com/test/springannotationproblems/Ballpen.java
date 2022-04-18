package com.test.springannotationproblems;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Primary
public class Ballpen implements Pen {

	@Override
	public void write() {
		System.out.println("parker");		
	}

}
