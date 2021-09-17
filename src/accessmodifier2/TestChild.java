package accessmodifier2;

import accessmodifier.TestClass;

public class TestChild extends TestClass{
	
	
	
	
	public static void main(String[] args) {
		
//		TestClass t =new TestClass();----bez it is parent class object 
//    	t.m5();// protected Method show error. it invalid
		
		 TestChild tc=new TestChild();  // protected method run with the help of child class object
		 // protected method from TestClass call with help of the child/sub class reference variable in different package class which is sub class of TestClass 
		
		 tc.m5();  
		 tc.m10();  // 1 way. it static but call with help of object. so--> protected also called misterrius access modifier
		 TestClass.m10(); // 2 way to access protected method but only in child class 
		 
		 //variable calling
		  
		 System.out.println(tc.j);   // protected call help of child reference variable
		 
 	}

}
