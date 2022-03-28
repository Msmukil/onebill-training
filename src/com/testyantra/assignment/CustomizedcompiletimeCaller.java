package com.testyantra.assignment;

public class CustomizedcompiletimeCaller {
	public class CustomizedCompileTimeExceptionCaller {
		  public void Mymethod() {
			try {
				throw new  Customizedcompiletimerecepient("My Exception Handled");
			}catch( Customizedcompiletimerecepient e) {
				e.printStackTrace();
				System.out.println(((Throwable) e).getMessage());
			}
		}
		}

	public void Mymethod() {
		// TODO Auto-generated method stub
		
	}

}
	
	
