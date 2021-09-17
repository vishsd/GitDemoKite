package castingtype;

public class Child extends Parent {

	public void m1 () {
		System.out.println("m1 from child");
	}
	public void m3 () {
		System.out.println("m3 from child");
	}
	
	public static void main(String[] args) {
// UP Casting : sub class convert to super class
		
		Child c = new Child();
		
		//Parent cc = new Child();
		                                                   // this both are same
		Parent pp = (Parent)c;
		
	    c.m1();  // m1 method is override so execution done on runtime object
	    
		pp.m1();  // child bcz m1 method is override so execution done on runtime object 
		pp.m2();  // parent bcz not override so execution done on reference variable
		System.out.println("*********************************");
		
// Down Casting : super class convert to super class
		
		//Child dd = new Parent();  //1. it show error--Type mismatch: cannot convert from Parent to Child
	
//		Parent p = new Parent();   
//		                      //show exception---"ClassCastException" 
//		Child ee = (Child)p;        // 2. 1&2 both are same so it is invalid 
//		ee.m1();
//		ee.m2();
		
		Parent t= new Child();        // up casting
		                                                  // we can not done down casting directly ---"1st do up casting then down casting"
		Child e = (Child)t;           // down casting
	
		e.m2();
		e.m1();
		e.m3();
		e.m2(12);
		
		
	}
		
}

