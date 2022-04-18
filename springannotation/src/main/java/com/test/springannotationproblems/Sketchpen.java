package com.test.springannotationproblems;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Qualifier
public class Sketchpen implements Pen {

	@Override
	public void write() {
		System.out.println("Hero");
		
	}

}
