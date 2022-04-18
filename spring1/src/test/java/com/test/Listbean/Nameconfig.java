package com.test.Listbean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Nameconfig {
	@Bean
	public Namelist name()
	{
		return new Namelist(Arrays.asList("sri","naveen","hari"));
	}

}
