package loops;

public class HWwhiledoLoop {
	
	
	public static void main(String[] args) {
	// 1. print odd number from while loop
		System.out.println("******ODD Number******");
		int i=0;
		while(i<=15) {
			if(!(i%2 ==0)) {                    // (i%2==1),(i%2 !=0) odd. (i%2==0) even
				System.out.print(i+" ");
			}
			i++;              //operator not use in if statement
						
		}
	// 2. print table 3
		
		System.out.println();                           // new line 
		System.out.println("******TABLE-3******");
		int j=1;
		while(j<=30) {
			
			if(j%3==0){
				System.out.print(j+" ");     // Continuation happen
			}
			j++;
		}
	// 3. print fibonacci series
		
		System.out.println();
		System.out.println("******fibonacci Series******");
		
		int a=0, b=1,c=0;
		while(c<=25) {
			//c= a+b;
			System.out.print(c+" ");    // if ln (Ln) are remove then printed value print in one line. ln --use for new line
		  c= a+b;
		  a=b;
		  b=c;
			//b=c;
			//a=b;
			   
		}
		System.out.println();
		System.out.println("******fibonacci Series in do- while loop******");
		int p=0, s=1,r=0;
		do {
		
			r=p+s;
			p=s;
			s=r;
			System.out.print(r+" ");
		}
		while(r<=25);
		
		
		
		
	}

}
