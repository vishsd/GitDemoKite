package inheritance;

public class Child1 extends Father{  // we can extends only one class at a time but a class can extend many time
	int g =50;
	public void bike () {
	System.out.println("father class running g is :"+super.g);// g from parent class. super are used in under  syso statement (super.varable name)
	
	System.out.println("father class running g is :"+g); // g from child class 
		System.out.println("bike from child 1");
	}
	
	
	
	public static void main(String[] args) {
		Child1 c= new Child1();
		c.car();
		c.farm(); // farm is grand father class if have to extend then first is extend in father and then extend father to child
		c.home();
	System.out.println(cash);
	c.bike();
	}

}
