package inheritance;

public class GrandFather {

	
	public void farm() {
		System.out.println("farm from grandfather");
	}
	public void home() {
		System.out.println("Home from grandfather");
		
	}
	
	public GrandFather(){
		System.out.println("constractor from GrandFather");
	}
	public static void main(String[] args) {
		GrandFather GF = new GrandFather();
		GF.farm();
		GF.home();
	}
}
