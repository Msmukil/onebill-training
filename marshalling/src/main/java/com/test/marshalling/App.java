package com.test.marshalling;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App 
{
    public static void main( String[] args )
    {
    	
    		Employee employee = new Employee();
    		employee.setId(1);
    		employee.setName("raj");
    		employee.setSalary(20000);
    		employee.setDesignation("developer");
    		employee.setPassword("mukil");
    		Address address = new Address();
    		address.setHouseno(1-33);
    		address.setStreet("abc");
    		address.setCity("qwer");
    		address.setPincode(98676);
    		employee.setAdd(address);
    		
    		//System.out.println(employee.getPassword());
    		try {
    			JAXBContext context = JAXBContext.newInstance(Employee.class);
    			Marshaller marshaller = context.createMarshaller();
    			FileWriter writer = new FileWriter("src/main/java/emp.file");
    			marshaller.setProperty( marshaller.JAXB_FORMATTED_OUTPUT,true);
    			marshaller.marshal(employee,System.out);
    			marshaller.marshal( employee,writer);
    }catch(JAXBException | IOException e) {
    	//e.printStackTrace();	

            }
}
}
