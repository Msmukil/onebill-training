package com.test.springannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.test.springannotation"})
public class MobileConfiguration {

}
