package polymorphism;

public class ParentOverloding {  
	int a = 20;   // variable are not Overloading
	
	// method name same but different argument/ order in same or child class then it a overloaded method
	
	public void m1 () {
		System.out.println("m1 from parent method running");
	}
	
	public void m1 (int a) { 
		System.out.println("m1 method with arg running");
	}
	
	public void m1 (int a,int c) { 
		int d = a+c;                // + is only operator is overloading 
		System.out.println(d);
	}
	
	public void m1 (String s, String p) { 
		String g = s+p;
		System.out.println(g);      //***** println is also overloading  method*****
	}
	
	public  String m1 (String s) {                 // method with return type
		System.out.println("m1 method with return type running");
		return ("s");
	}
	
	public ParentOverloding () {                  // constructor method type it mean it is follow overloading
		System.out.println("constructor are running");
	}
	public ParentOverloding (int b) {                //it is follow overloading
		System.out.println("constructor with arggument are running");
	} 
	 public static void m2 () {
		 System.out.println(" m2 static method running ");
	}
	 
	 public static void m2 (boolean b ) {
		 System.out.println(" m2 static method running ");
	}
	 
	void m1 (int a,double d) {                    // method with different access modifier ex.-- <default>
			System.out.println("m1 method <default> modifer from parent running");
	}
	
	 public void m2 ( int a , String d) {
		 System.out.println(" *m2 same arg but diffrent order method running *");
	}
	                                      //*** this two method arg are same but order are different so it can a overloaded method
	 public void m2 (String d, int a) {
		 System.out.println("* m2 same arg but diffrent order method running* ");
	}
	public static void main(String[] args) {
		ParentOverloding ol = new ParentOverloding();
		ol.m1();
		ol.m1(11);
		ol.m1(40, 35);
		ol.m1("vishal", "shinde");
		ol.m1(null);
		ParentOverloding ol1 = new ParentOverloding(50);
		m2(true);
		m2();
		ol.m1(2, 2.4);
		ol.m2(30, "s");
		ol.m2("s", 30);
		
	}

} 
