package com.testyantra.assignment;

 class InstanceGFG {
	
	      // static method
	    public static void main (String[] args) {  
	        
	          // Creating object of the class
	        InstanceGFG obj = new InstanceGFG();          
	        
	          // Calling instance method
	        obj.disp();  
	        
	        System.out.println("GFG!");
	    }
	        
	      // Instance method
	    void disp()                                  
	    {
	          // Local variable
	        int a = 20;                              
	        System.out.println(a);
	    }

}
