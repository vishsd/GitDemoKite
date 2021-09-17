package polymorphism;

public class ChildOverload extends ParentOverloding{  // ****in overloading do not require extends the class but we can extends it****
	
	
	public void m1(double a) {
		System.out.println("m1 method from Childoverloading");
	}
	public void m1 () { // ** if parent & child have same arg method it is overriding not overloading. show triangle= OVERRIDE
		System.out.println(" childOverLoad m1 method running");
	}
//	public void m1(int c) {
//		
//		System.out.println(c);
//	}
	public static void main(String[] args) {
		
		ChildOverload c = new ChildOverload();
		
		c.m1();
		System.out.println("************************");
		
		ParentOverloding pp = new ChildOverload();
		
		pp.m1(20, 32.3); // here to dessiaed at the time of method compilation to which method run 
		pp.m1();        // or to the object reference variable. so it called as "compile time polymorphism"
	}
	
	public static void main(int[]args) {   // main method should be overloaded
//		ChildOverload d = new ChildOverload();
//		d.m1(30);
	}
}
