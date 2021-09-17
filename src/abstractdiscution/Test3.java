package abstractdiscution;

public class Test3 extends Test2 {
	
	public Test3 ()
	{
		System.out.println("Test3 class constractor");
	}

		@Override
		public void m5() {  // if that child also don't have all implementation of method then we again declare remaining method are abstract.
		
		                 	// and this method implement again create child class
			System.out.println("m5 method from Test3 class");
		}
	
		@Override
		public void m6() {
			System.out.println("m6 method from Test3 class");
		
	}
		
		public static void main(String[] args) {
			Test3 t = new Test3();
			t.m1();
			t.m2();
			t.m4();
			t.m5();
			t.m6();
			
		}

}
