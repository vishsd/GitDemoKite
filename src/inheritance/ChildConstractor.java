package inheritance;

public class ChildConstractor extends ParentConstractor {
	
   public ChildConstractor()
	{
	   super(false);  // if in parent class zero arg constructor not available then use super keyword like 
	     // other wise it show error like--Implicit super constructor ParentConstractor() is undefined. Must explicitly invoke another constructor
	    
		System.out.println("child class constractor");
	}
	
	public ChildConstractor(int a)
	{
		//super(30,4); --- if parent constructor have no agr constructor then o/p like this   
		System.out.println("one arg child class constractor");
	}
	
	public static void main(String[] args) {
		
		ChildConstractor  cc = new ChildConstractor(); // first call the parent constructor & then call child constructor
		
		ChildConstractor  cc1 = new ChildConstractor(10); //it a one arg constructor object but also call zero arg constructor in parent class
		
		                          // i.e. constructor don't follow INHERITANCE
		     //*** Because if parent class have arg constructor then in child class it cannot be call direct.***
		    //**** if want to call then we have to create object that's way constructor don't follow inheritance****
	}
}

		