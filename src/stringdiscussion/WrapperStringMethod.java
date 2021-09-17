package stringdiscussion;

public class WrapperStringMethod {
	
	//wrapper method are static in nature
	
	public static void main(String[] args) {
		
		// ******Conversion of non-primitive to primitive****---(   to use "parse" method )
	
//1  .parseInt(String) -- convert the string(non primitive) to particular primitive data type i.e -integer data type
		
		String s = "10";  // we want to convert string 10 to int 10 type
		         // using this string value we do not perform Arithmetic Operation so it be converted into int
		int i = Integer.parseInt(s);
		
		System.out.println(i);
	     int add = i+20;
	     System.out.println(add);
	     System.out.println("****************************************");
	     
//2  .parseBoolean(true/false)	     
	     String s1 = "truesss";  // if we any other value in string boolean gives it false
	      boolean t = Boolean.parseBoolean(s1);
	     System.out.println(t);
	     
	     System.out.println("****************************************");
	     
//3 .parseDouble(String double val) 		
	     String s3 = "23.44";
	    double a = Double.parseDouble(s3);
		System.out.println(a);
		
System.out.println("********************************************************************************************");	
		
		
		// *****Conversion of primitive to non-primitive****---(   to use  "valueof" method  )
		
// valueof -- it convert the primitive data type to non primitive type i.e string
		
		int d = 33;
		
		String ss1 = String.valueOf(d);
		
		System.out.println(ss1);
		
		char c = '#';
		
		String ss2 = String.valueOf(c);
		System.out.println(ss2);
	}
	
	
	
	

}
