package com.test.spring1;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Engine {
	private String size;
	private String power;

}
