package exceptionhandaling;

public class ThrowKeyword {

	// throw key word are use conditional statement or directly

	// it use to throw the exception deliberately if condition are true 

      public static void main(String[] args) {
	
    	  int i = 5;
    	  int j = 20;
    	  
    	 // throw new ArrayIndexOutOfBoundsException();  // if we write like this below code are unreachable
    	  
    	  if (i>j) {   
    		  throw new NullPointerException(" null pointer exception has come");
    		  
    	  }
//    	  else {
//    		  throw new ArithmeticException("Arithmetic Exception ha come"+"i<j");
//		}
    	  if (i<j) {   
    		  throw new ArithmeticException("no comment");
    	  }
    	  
//    	  if (i<j) {    // we can throw the exception deliberately
//    		  throw new TodayNoClassException("no comment");
//    	  }
   	  
    	  System.out.println("before exception");
   }
	
	
}
