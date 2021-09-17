package abstractdiscution;

public abstract class Test {
	
	public Test ()
	{
		System.out.println("Test class constractor");
	}
	
	public void m1 () {
		System.out.println(" m1 method from test class");
	}
	
	public abstract void m2();  // if we declare a method abstract then class should be an abstract
	
	public abstract void m4();  // if we want implement this method then we create child class to implementation
	public abstract void m5();
	public abstract void m6(); 
	
	
	public static void m7() {
		System.out.println("m7 static method");
	}
	
	//public abstract static void m8 ();  we cant create static w.r.t. abstract . bcz static cant be override on child method
	
	
	public static void main(String[] args) {
		
		//Test t = new Test(); -- we cannot create object on abstract class as it contain complete as well as incomplete method
	}

}
