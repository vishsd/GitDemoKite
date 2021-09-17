package loops;

public class LoopsDisccution {
	
	// continuously execution of code /set of program while condition is true means loops. if condition false then stop execution
	
		public static void main(String[] args) {
		System.out.println("loop start");   // if we want this syntax run continuously/ many time. then use loops
		System.out.println("****** do while loop *******");
// 1. while loop
		               // we do not know how many time to print value then we use ---"while" loop
	    int i=0;
		while (i<10) {   // if condition true then action perform continuously.  it also called "infinite loop"
			//Action
			
			System.out.print(" Hello");
			
			i++;                         // incremental / decremental operator use only with variable. not an value (i.e.=5++;) like
		}
		System.out.println();
		System.out.println("****** do while loop *******");
		
// do while loop
		        //  if we want to run a code at list one time then do while loop are use
		int j= 0;
		do 
		{
			System.out.println("do Hello");
		}
		while(false);       // if while is false but do run at list one time 
		                    // if give the condition then it follow
		do
		{
			System.out.println("2 do Hello");
			j++;
			++j;
		}
		while(j<5);
		
		System.out.println("********** for loop **************");
		
// for loop
		      // syntax
//		       1              2,5,8            4,7,10
//		for(initialization; condition; increment/decrement)
//		{
//		     3,6,9
//		   Action to be performed as condition become true
//		}
		// 1.
		for (int k=0; k<=5; k++) {
			System.out.println("executing for loop "+k+" time");
		}
		// 2.
		int g= 1;
		for (System.out.println("--vishal--"); g<=3;System.out.println("**shinde**") ) {
			System.out.println("inside the loop "+g+" time");
			g++;
		}
		
	}

}
