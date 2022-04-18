package com.test.unmarshalling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Appp 
{
    public static void main( String[] args )
    {
    	
    		Employe employee = new Employe();
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
    			JAXBContext context = JAXBContext.newInstance(Employe.class);
    			Unmarshaller unmarshaller = context.createUnmarshaller();
    			FileReader reader = new FileReader("src/main/java/emp.xml");
    			Object unmarshal = unmarshaller.unmarshal(reader);
    			Employe e = (Employe) unmarshal;
    			System.out.println(e);
    			System.out.println(unmarshal);
    			    }catch(JAXBException | IOException e) {
    	//e.printStackTrace();	

            }
}
}





