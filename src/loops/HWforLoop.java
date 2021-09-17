package loops;

public class HWforLoop {
	
	
	public static void main(String[] args) {
//ex.1		*****
		
		System.out.println("---- print 5 star ----");
		for(int i= 1; i<=5;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("---- print 5 time 5 star ----");
//ex.2    *****
		//*****
		//*****
		//*****
		//*****
		for (int j=1; j<=5;++j) {
			System.out.println();
			for(int i= 1; i<=5;i++) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println("---- print triangural star pattern 1 ----");
//ex.3    *
		//**
		//***
		//****
		//*****
	     	for (int i=1; i<=5; i++) {
		       for (int j=1; j<=i; j++) 
		       {
					System.out.print("*");
			   }
		      System.out.println(" ");
	     	}
		System.out.println();
		System.out.println("---- print triangural star pattern 2 ----");
//ex.4    *****
		//****
		//***
		//**
		//*
				for (int i=1; i<=5; i++) {
				for (int j=5; j>=i; j--) {
				
						System.out.print("*");
					
					}
				System.out.println(" ");
				}
		System.out.println();
		System.out.println("---- print triangural star pattern 3 ----");
//ex.5        *
		//   **
		//  ***
		// ****
		//*****
					for (int i=1; i<=5; i++) {
						for (int j=4; j>=i; j--)
						{
							System.out.print(" ");
						}
						 for (int k=1; k<=i;k++)
						  {
							System.out.print("*");
						  }
					  System.out.println();
					}
		System.out.println();
		System.out.println("---- print triangural star pattern 4 ----");
//ex.6      *****
	     //  ****
		 //   ***
	     //    **
	     //     *
							for (int i=1; i<=5; i++) {
								for (int j=2; j<=i; j++)
								{
									System.out.print(" ");
								}
							      for (int k=5; k>=i;k--)
									{
										System.out.print("*");
									}
								System.out.println();
							  }



	}

}
