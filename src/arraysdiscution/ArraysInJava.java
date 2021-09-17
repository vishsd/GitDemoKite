package arraysdiscution;

public class ArraysInJava {
	
	// Arrays is a collection of homogeneous kind of data type / element in single entity is called array
	
	public static void main(String[] args) {
// 1 st way to define array		
	   // we want int type array
	  int [] a = new int[6];  // in that int a is array it a 6 time iteration will gives
		
		a[0] = 32;   // [index value]
		a[1] = 43;
		a[2] = 50;
		a[3] = 1;
		a[4] = 12;
		a[5] = 0;
	//	a[6] = 34;  // it gives exception ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
				
		System.out.println(a[3]);
// type 1
		  for (int i =0; i<6;i++) {   // if want to iterate it
		     	System.out.println(a[i]);
		 }
	System.out.println("********************************************************");
	
// type 2
	
	     int index = 0;        // index value start from 0
	     
		   for(int d:a) {           // for each loop or advance for loop
	 //( what type of "a" value : what to iterate i.e--a )
			   
		    System.out.println("Array index value is:"+index);
			System.out.println(d);
			index++;
		 }
		    
	System.out.println("*********************************************************");
		//if we want control for each loop
		
	     for(int c:a) {
		
		     if (c==1) {  // if loop rich to value 1 then break the loop 
		       	break;
		     }
		     System.out.println(c); // only print 32,43,50
	}
	System.out.println("*********************************************************");
		
// 2nd way to defind array
	
	    char [] c = { 'w', 't','@','&','*','v'};
	    
	    		for(char g:c) {
	    			System.out.println(g);
	    		}
	    }

	}
	
