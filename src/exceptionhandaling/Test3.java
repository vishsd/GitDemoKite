package exceptionhandaling;

public class Test3 {
	
	public static void main(String[] args) {
		

		try {                                         
			int a=23;
			int b= 0;
			int c = a/b;  //exception arrive and code terminate abnormally
			System.out.println(c);
			
		} 
//		catch (Exception e) { // exception is a super class of exception so it can handal all type of exception but it write 1st then remaining code are "unreachable"
//			System.out.println("exception catch is running");
//		}
		catch (NullPointerException t)                               
		{       // in try block we write a multiple catch block
			System.out.println("null point exception catch is run");
	
		}
		
		catch (StringIndexOutOfBoundsException e) 
		{      
			System.out.println("exception accure:"+e.getMessage());  // e.getMessage () give the message for which exception accured.
			System.out.println("Arithmatic catch is running");
		}
		
		catch (Exception e) {                     // exception is a super class of exception so it can handal all type of exception 
			System.out.println("exception catch is running"+e.getMessage());  // it gives the message (/ by zero)
		}
	}

}
