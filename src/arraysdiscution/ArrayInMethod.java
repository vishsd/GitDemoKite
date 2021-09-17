package arraysdiscution;

public class ArrayInMethod {
	
// Array can use as an argument inside the method (method with argument)
	
	public static void m1(String d[]) 
	{
		for (String ss:d) {
			System.out.println(ss);
		}
	 }
	
// Array with return type
	
	public int[] m2() 
	{
		int a[] = new int[3];
		a[0] = 12;
		a[1] =32;
		a[2] = 10;
		
		for(int b:a) 
		{
			System.out.println(b);
		}
	return a;
	}
	
	public static void main(String[] args) {
		
		String [] s = new String [2];          // 1st way
		//String s [] = new String [2];        // 2nd way
		
		s[0] = "abcdef";
		s[1] = "GHIJK";
		
		m1(s);
		System.out.println("*********************");
		ArrayInMethod t = new ArrayInMethod();
		t.m2();
		
		
		Boolean b [] = new Boolean[3];
		b[0] = false;
		b[1] = true;
		b[2] = true;
				
		
		
		
	}

}
