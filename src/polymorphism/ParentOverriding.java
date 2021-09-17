package polymorphism;

public class ParentOverriding {
	
	// in overriding method name, argument , return type are same in Child class the this method are overrided method
	
	final int i=20;    // if a variable declare a final then we can not Reassign the value of i but it can be use it    
	int j = 40;     //
	
	public void home () {
		System.out.println("home from parent class");
		// i=50;---we can not Reassign the value of i because it final variable
		}
	
	public void property() {
		System.out.println("property from parent class");
	}
	
	public void car () {
		System.out.println("car from parent class");
	}
	
	public void marry () {
		System.out.println("marry from parent class");
	}
	
	public final void bike() {                     // if parent want do not extends a method then he declare final method
		System.out.println("bike from parent class");  // after declare final method cannot Override
	}
	
//	final void bike() {    *** final at method level use to all type of method access modifier --public,<default>,private,protected
//		 
//	}
	
	public void bicycle() {   // look override method --child class
		System.out.println(" bicycal method from parent class");
	}
	
	 void bicycle1() {      // go to override method --child class
		System.out.println(" bicycal 1 method from parent class");
	}
	 
	 private void cash () {   // it independent method bcz private do not be override
			System.out.println("parent cash method");
		}
	 
	 public static void m1 () {
		 System.out.println("static m1 method from parent class");
	 }
	  
	  



	public static void main(String[] args) {
		
		
		
	}
}
