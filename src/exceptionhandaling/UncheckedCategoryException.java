package exceptionhandaling;

public class UncheckedCategoryException {   // error show in at run time mean Uncheck category exception

	// any unwanted event or condition accrued in the program to terminate the code abnormally is called exception handling (Robust property of java)
	
	
	
	public static void main(String[] args) {
		
		
		try {                                         // use == to write a risky code
			int a=23;
			int b= 0;
			int c = a/b;  //exception arrive and code terminate abnormally
			System.out.println(c);
			
		} 
		catch (NullPointerException t)                                // use == Bypass the method bcz here exception accrued
		{       // in try block we write a multiple catch block
			System.out.println("null point exception catch is run");
	
		}
		
		catch (ArithmeticException e) 
		{      // if exception type and catch box are not match then exception not handal
			System.out.println("Arithmatic catch is running");
				
		}
		
	System.out.println("********************************************");
		
		
		try {
			String g = null;
			boolean compair = g.equals("abc");
			System.out.println(compair);
		} catch (NullPointerException e) {
	          System.out.println("null point catch is running");
		}
		
		// if catch block write or not but have finally block then error do not show
		finally {                                         // use == clean up activity  ----- it is not compulsory block    
			                          // if exception accrued or not finally block always execute.
			System.out.println("Finally Block");
		}
	System.out.println("********************************************");
		try {
		   String s5 = "asdfgth";
		   
		   char ch = s5.charAt(4);  // index value start from 0 1 2 like
		   System.out.println(ch);
		   System.out.println(s5.charAt(7)); 
		 }
		   catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index out of Bound catch is runnig");
			
	     }
		
		System.out.println("********************************************");
		
		try {
			String s = "10f";
			int i = Integer.parseInt(s);  // Warper class are int type so it give only int value so exception come
			System.out.println(i);
			
			
		} catch (NumberFormatException e) {
			System.out.println("number format exception has come");
		}
		
		
		
		
		
		System.out.println("Hello");
		
	}
}
