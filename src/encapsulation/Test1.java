package encapsulation;

public class Test1 {  // suppose it is ATM
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		EncapsulationDiscution1 t= new EncapsulationDiscution1();
		
	//	System.out.println(t.balance1); -- this is outsider - not visible data 
		
		t.getBal("vishal", 0127); // this line show ABSTRASCTION 
		
		        //(user know only method but he didin't know logic behind this.he only show the functionality will perform, is called Abstraction)
		
		t.getBal("vishal",1234 );   
		
		
		
	}

}
