package encapsulation;

public class EncapsulationDiscution1 {  // Suppose this is SERVER
	
	//security= Encapsulation in java == data hiding + Abstraction
	
	private double balance1 = 150.48; //if we want achieve encapsulation then variable should be private
	
	
	
	public void getBal(String name,int pin) {   // this is DATA HIDING***** it is a getter method it provide information/logic to read the data 
		//(ex. getmethodname) getter method
		
		// this is a data hiding concept mean's here we hid the private variable  balance1 
		// data hiding == hiding a particular variable which is not use to outsider (a private variable declare inside the public method)
		
		if (pin==0127) {
			System.out.println(balance1);
			
		}
		else {
			System.out.println("please enter correct i/p");
		}
			
	}
	public void setBal(double bal,double withdrowalbal,int pin ) { // setter method provide the updated value
		//(ex. setmethodname)
		
		double latestbal= bal-withdrowalbal;
		
		if (pin==0123) {
			System.out.println(latestbal);
		}
		else {
			System.out.println("please enter correct i/p");
		}
	}
	
	
	
	public static void main(String[] args) {
		EncapsulationDiscution1 t= new EncapsulationDiscution1();
	t.getBal("vishal", 0127);
	t.setBal(150.40, 50,0123);
	
	}
}
