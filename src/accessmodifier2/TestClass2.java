package accessmodifier2;

import accessmodifier.ClassLevalModifier;

public class TestClass2 {

	
	
	
	
	public static void main(String[] args) {
		ClassLevalModifier clm = new ClassLevalModifier(); //1. public class level modifier accessible with different package
	                                                	 //2. <default> class level modifier are not accessible in different package show error
		                                                //3.final use with public then it access all package but don't create sub/child class
		
		clm.m1();     // public method level modifier access different package different class
		//clm.m2();  ----it is  <default> method level modifier don't show other package
		//clm.m3   -- ---it is private method level modifier do not use in out side the class
		ClassLevalModifier.m6(); //static public method different package
		  
		//variable  calling
		System.out.println(clm.a);
//		System.out.println(clm.b); <default> variable
//		System.out.println(clm.c); private variable
//		System.out.println(clm.d); protected variable
		
	}                                                   
}
