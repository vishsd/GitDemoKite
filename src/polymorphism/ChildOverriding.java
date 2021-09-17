package polymorphism;


public class ChildOverriding extends ParentOverriding{
	
	int j = 50;  //variable not follow  overriding

	public void marry() {              // if child don't want parent marry method he want change in marry method then he override marry method
		
		System.out.println("marry from child");  // triangle show override
	}
	

//	public final void bike() {                     // do not extends or Override bez it final method
//		System.out.println("bike from parent class");
//	}
	
	
       public void bicycle() {   // if we override a method and we reduce access of Override method then show error we can reduce the access
        	 //error- Cannot reduce the visibility of the inherited method from  ParentOverriding
        // reduce access mean's -public method reduce to <default>
		System.out.println(" bicycle method from parent class");
	}
      public void bicycle1() {   // we can increase the access of override method 
   		System.out.println(" bicyle 1 method from parent class");
   	}
      
      private void cash () {   // it independent method bcz private do not be override
		System.out.println("child cash method");
	}
      
      public static void m1 () {   // static method do not follow overriding bcz `it run on base of reference variable
 		 System.out.println("static m1 method from child class");  // it follow method hiding
 	 }
 	  

	
	
	public static void main(String[] args) {
		ChildOverriding c = new ChildOverriding();
		c.car();
		c.home();
		c.property();
		c.marry();     // child marry method run
		c.m1();   //child m1 method
		System.out.println("j value of child variable is :"+c.j);
		
		System.out.println("****************************************");
		
		ParentOverriding t = new ParentOverriding ();
		
		t.marry();    //parent class marry method are running
		t.m1();   // parent m1 method
		System.out.println("j value of parent variable is :"+t.j);
		
		System.out.println("******************************************");
		
		
		ParentOverriding tt = new ChildOverriding ();  // if inhritance condition have then we create object like this
		
		// hare method resolution done on the basis of run time  object 
		//i.e. at the run time dissied which method to run so it also called run time polymorphism 
		
		tt.bike(); // parent bike
		tt.home();  // parent home
		
		tt.marry();    // child class marry method are running
		tt.m1();    // parent class method ---// static method do not follow overriding bcz `it run on base of reference variable
		System.out.println("j value of parent variable is :"+tt.j); // variable do not follow overriding bcz `it run on base of reference variable
		
	}  

}
