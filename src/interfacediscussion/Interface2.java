package interfacediscussion;

public interface Interface2 extends Interface1{     // interface inherited to interface then == use "extends" keyword
          // in that multiple inheritance are possible
	
	
	public void m8();
	
	
	public static void m7() {  // in that we can not declare static method has a incomplete  
		// static method always concrete on interface
		System.out.println("m7 method from intrface");
	}
	
	public static void main(String[] args) {
		System.out.println(i);    // variable are directly call i possible in interface(interface1 TO interface2) 
		
		
	}
	

}
