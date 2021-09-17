package arraysdiscution;

public class ArrayExample {

	public static void main(String[] args) {
		
		int [] a = new int[10];
		a[0]=10;
		a[1]=9;
		a[2]=8;
		a[3]=7;
		a[4]=6;
		a[5]=5;
		a[6]=4;
		a[7]=3;
		a[8]=2;
		a[9]=1;
		
// add the given array
		 int j = 0;
		                // 1 way
		for(int i:a) {
			j=j+i;
		 }
		               // 2 way
//		 for(int i=0;i<10;i++) {
//			 j=j+a[i];
//		 }
		 
		System.out.println("Addition of Array is:"+j);
		System.out.println("************************************");
		
// Addition of all odd index value of array
		int h=0;
		for(int k:a) {
		
			if(!((k%2)==0)) {
				h=h+k;
		    	}
	    	}
	     System.out.println("addition of odd array is:"+h);
	     System.out.println("************************************");
// Addition of All Even index value of array 	     
	     int d=0;
			for(int k:a) {
			
				if((k%2)==0) {
					d=d+k;
				}
			}
		System.out.println("addition of Even index value array is:"+d); 
	}
}

