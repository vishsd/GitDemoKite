package abstractdiscution;

public class C extends AbstractExample{
	
	public void m5 () {
		
		System.out.println("m5 from class c");
		
		aa.m1();
		bb.m3();
	}
	
      public void m6 () {
		
		System.out.println("m6 from class c");
		
		aa.m2();
		bb.m4();
	}
	
	
	
	
    public static void main(String[] args) {
		
		C c = new C();
		c.m5();
		c.m6();
		
	}

}
