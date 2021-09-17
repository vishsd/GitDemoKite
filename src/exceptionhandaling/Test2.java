package exceptionhandaling;

public class Test2 {
	
	public static void main(String[] args) {
	try {	
		
	String s= null;//--- it a risk code
	
	boolean compared = s.equals("vishal");  // to compared the string to anther string ---equal method are used
	System.out.println(compared);
	}
	
	
	catch (NullPointerException e) {
	System.out.println("null point catch box running");
	
	String latestString= "vishalshinde";
	
	System.out.println(latestString);
	
	}
	System.out.println("end");
	}


}
