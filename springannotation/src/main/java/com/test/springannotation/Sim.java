package com.test.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Sim {
	
	@Value(value = "Jio")
	String name;
	@Value(value = "38488484")
	String number;
}
