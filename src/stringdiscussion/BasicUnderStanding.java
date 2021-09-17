package stringdiscussion;

public class BasicUnderStanding {
	
	
	public static void main(String[] args) {
		
// 1st way to define String 
		String s = "abc";              // this object stored in scp (String constant pool area) 
	                                     	// it point on scp area
		System.out.println(s);
		
//2nd way to define String
		
		String ss = new String("abc");    // this object stored in HEAP memory and scp (String constant pool area)
		                                    // it point on heap memory
		System.out.println(ss);
// ex. 	
		String s1 = "ghi";
		String s2 = "ghi";                        // here both are pointing of same object 
		
		if (s1==s2) {
			System.out.println("pointing to the same object");
		}
		else {
			System.out.println("not pointing to the same object");
		}
		
	System.out.println("**************************************************************");
		String ss1 = new String("ghi");
		String ss2 = new String("ghi");             // here duplication of object happen .so it create two object of same value
		
		if (ss1==ss2) {                               
			System.out.println("pointing to the same object");
		}
		else {
			System.out.println("not pointing to the same object");
		}
		
	System.out.println("***************************************************************");
		
		if (s1==ss1) {                               // s1 - refer to scp (String constant pool) area and ss1 refer to heap area
			System.out.println("pointing to the same object");
		}
		else {
			System.out.println("not pointing to the same object");
		}
		
	System.out.println("*****************************************************************");	
		
		
		
		
		
		
		
	}

}
