 package castingtype;

public class PrimitiveCasting {
	
	// boolean cant be cast to other type data type

	public static void main(String[] args) {
		
// Explicit type Casting -- higher order data type convert to the lower order data type-- narrowing data type.
		System.out.println("Explicit type casting");
		// in that case chance to "data loss" 
		int i = 30;
		
		 byte a = (byte)i;
		 System.out.println(a);
		 
	// ex.1 data loss	 
		 int c = 130;
		byte d = (byte)c;    // in that byte size (-127 to 128) so data loss and it start on -127 "reset it"
		System.out.println(d);
		
	// ex.2 data loss
		 
		   double v = 232.45;
		   
		  int k = (int)v;
		System.out.println(k); // .45 loss bcz of double to int conversion
		System.out.println("***************************");
// Implicit type casting -- lower order data type convert to the higher order data type -- widening of data type
		System.out.println("implicit type casting");
		byte f = 50;
		int g = (int) f;
		System.out.println(g);
		
		char cc = 'B'; 
		int bb = (int)cc;
		System.out.println(bb);  // 66 is a ascii value of 'B'
		
		char p = ' '; 
		int o = (int)p;
		System.out.println(o);  // 32 is a ascii value of ' ' space
		
		int w = 88;
		char q = (char)w;
		
		System.out.println(q); // 88 is askki value of X
		
	}

}
