package inheritance;

public class Child2 extends Father{

	int g=50;
	public void m1(){
				
		System.out.println(super.g);// g from parent class. super are used in under  syso statement (super.varable name)
	}
	public static void main(String[] args) {
		  
		Child2 c2= new Child2();
		c2.bunglo();
		c2.property("flot");
		c2.car();
		c2.m1();
		
	}
}
