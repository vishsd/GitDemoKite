package accessmodifier;

public class ClassLevalModifier { // Check different class level modifier: <default>,final,
	                                  // use <default> show blue triangle 
	                                 // use final then we do not create a child class/ don't be follow inheritance
	                                 // "public final class XYZ or final public class XYZ --- use of final modifier
	
	// method or variable level access modifier----1. variable level modifier
	
	public int a = 10; // public modifier accessible the all the package
	
	int b = 20; // <default> modifier accessible the only within the same package
	
	private int c = 30; // private modifier accessible only within a same class
	
	protected int d = 40; // 1.if protected modifier accessible in directly in same package 
	                     // 2.if protected modifier accessible in different package use/w.r.t. child reference variable
	
	  // 2. method level variable 
	
	public void m1 () {                  // public method level modifier
		System.out.println("m1 public method from class level modifier"); 
	}
	public static void m6 () {                  // public method level modifier
		System.out.println("m6 static public method from class level modifier"); 
	}
	
	
	void m2 () {                        // <default> method level modifier
		System.out.println("m2 <default> method from class level modifier");
	}
	static void m7 () {                        // <default> method level modifier
		System.out.println("m7 static default method from class level modifier");
	}
	
	private void m3 () {
		System.out.println("m3 private method from class level modifier");
	} 
	protected void m4 () {
		System.out.println(" m4 protected method from class level modifier");
	}
	protected static void m9 () {
		System.out.println(" m4 protected static method from class level modifier");
	}
	
	
	
	public static void main(String[] args) {
		ClassLevalModifier clm = new ClassLevalModifier();
		clm.m1();
		clm.m2();
		clm.m3();  // only access in same class 
		clm.m4();
		
		TestClass t =new TestClass();
		t.m5(); // protected method modifier from  TestClass access same package different class
		m6();
		m7();
		m9();
		TestClass.m10();
		System.out.println(clm.a);
		System.out.println(clm.b);
		System.out.println(clm.c);
		System.out.println(clm.d);
	}

}
