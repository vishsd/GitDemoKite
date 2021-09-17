package accessmodifier;

public class TestClass { //extends  ClassLevalModifier
                     // if use final modifier in a class then this class can't be extend show error like-"The type TestClass cannot subclass the final class ClassLevalModifier"
	protected int j =50;
	
	protected void m5() {
		System.out.println(" m5 protected method from TestClass");
	}
	protected static void m10 () {
		System.out.println(" m10 protected static method from testclass");
	}
	
	
	public static void main(String[] args) {
		ClassLevalModifier clm = new ClassLevalModifier(); //1. public class level modifier accessible with same package other class
		                                                //2. <default> class level modifier are accessible in different class and same package
		                                                //3.final use with public then it access all package but don't create sub/child class
		                                                //4. final use with <default> modifier then it access only same class but don't create sub/child class
		 clm.m1(); // public method level modifier access same package different class
		 
		clm.m2();  //<default> method level modifier access same package different class
		
		//clm.m3    ---it is private  do not use in out side the class
		
		clm.m4();  // protected method modifier from Classlevelmodifier access same package different class
		
		TestClass t =new TestClass();
		t.m5();
		ClassLevalModifier.m6();//static public method different class, same package
		ClassLevalModifier.m7();
		ClassLevalModifier.m9();
		//variable calling
		
		System.out.println(clm.a);
		System.out.println(clm.b);
		//System.out.println(clm.c);  ----it is private variable
		System.out.println(clm.d);
	} 
}
