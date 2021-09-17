package interfacediscussion;

public interface Interface1 {
	
	// if don't anything about implementation then we declare interface
   // in that using interface we make a rule
	// constructor are not allow in interface
	
	public  void m1();  //In interface all method bidefault are abstract, public whether it is declare or not
	
	
	public abstract void m2();  // all are same method
	
	
      void m3();   // it also public so access to every where
	
      
	public void m4();  //non-static method always incomplete on interface
	
	
	public static void m6() {  // in that we have to provide body on static method. but can not declare static method as a incomplete  
		// static method always concrete on interface
		System.out.println("m6 method from intrface");
	}
	
	
    // hare we can not create an object bcz interface contain 100% abstract so can't create object
	// we can not have constructor inside an interface
	
	public static void main(String[] args) {
		
		m6();
		Interface2.m7();  // from interface 2
		
		Test2 t = new Test2();
		t.m1();
		System.out.println(i);
	//	i=30;    The final field Interface1.  i cannot be assigned but we can use it
		
		
	}
	// interface in term of variable
	  int i = 20;    // in that variable are always static (declare or not),public
	  
	
}
