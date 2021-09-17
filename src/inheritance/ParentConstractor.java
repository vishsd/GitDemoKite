package inheritance;

public class ParentConstractor {  // constructor do not follow inheritance
	
	
	public ParentConstractor ()
	{
		System.out.println("parent class constractor");
	}
	
	public ParentConstractor (int a, int b)
	{
		System.out.println(" two arg parent class constractor");
	}
	
	public ParentConstractor (boolean k)
	{
		System.out.println(" one arg parent class constractor");
	}


}
