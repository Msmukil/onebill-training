package com.test.spring1;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 @Configuration
 @ComponentScan(basePackages ="com.test.spring1" )
public class CarConfig {
//	@Bean(name = "audi" )
//	public  Car getCar() {
//		Car car = new Car();
//		car.setBrand("audi");
//		car.setModel("a4");
//		car.setPrice(200000);
//		return car;
//	}
//	@Bean(name = "suzuki")
//	public Car getCar2() {
//		Car car = new Car();
//		car.setBrand("suzuki");
//		car.setModel("a8");
//		car.setPrice(400000);
//		return car;
//	}	
//		@Bean (name = "engine1")
//		public Engine Engine4() {
//			Engine engine = new Engine();
//			engine.setSize("medium");
//			engine.setPower("1000");
//			return engine;
//		}
//
//			@Bean(name = "engine")
//			public Engine Engine5() {
//				Engine engine = new Engine();
//				engine.setSize("large");
//				engine.setPower("1500");
//				return engine;
//
//			}
//	
//			
//		
//
//	
//	
//	
//	
//	}
//
//
//
}