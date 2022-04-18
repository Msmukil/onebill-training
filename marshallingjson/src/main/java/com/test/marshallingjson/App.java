package com.test.marshallingjson;

import java.io.FileWriter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args ) throws JsonProcessingException
    {
    	
    		Employee employee = new Employee();
    		employee.setId(1); 
    		employee.setName("raj");
    		employee.setSalary(20000);
    		employee.setDesignation("developer");
    		employee.setPassword("mukil");
    		
    		ObjectMapper mapper = new ObjectMapper();
    		String string2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
    		String string = mapper.writeValueAsString(employee);
    		System.out.println(string2);
    		
    		
    		
    }
}
    		    		
    		