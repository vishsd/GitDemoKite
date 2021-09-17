package inheritance;

public class Father extends GrandFather {

	static int cash = 90000;
	 int g= 30;
	public void bunglo() {
	
		System.out.println("cash from father class");
	}
	public void car() {
		System.out.println("car from father class");
		
	}
	public void property(String land ) {
		String b = cash + land;
		System.out.println(b);
	}
	
	public  Father ( ) {
		super(); // call the constructor from grandfather class constructor. super keyword are call only in constructor not in method
	}
	
	
	
	
	public static void main(String[] args) {
		Father t = new Father();
		//t.home();
		t.farm();
		t.property("land");
		System.out.println(cash);
	}
}
