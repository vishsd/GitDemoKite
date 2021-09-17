package stringdiscussion;

public class MethodInString {
	
	
	public static void main(String[] args) {
		
		String s = "abc";
		String s1 = "abc";
		
//1. .equals ("String / String value") ----- it method check identical nature of string
		
		boolean identiacal = s1.equals(s);      // condition 1: 
		boolean identiacal1 = s.equals("abC");  // condition 2:  here c replace C so it not identical. it is case sensitive
		
		System.out.println(identiacal);
		System.out.println(identiacal1);
		
		System.out.println("*******************************************");
//2. .equalsIgnorCase ("String / String value")----in that to check a method is same or not without considering latter case. it don't check identical nature of string
		
		String s2 = "abc";
		String s3 = "ABC";
		
		boolean same = s2.equalsIgnoreCase(s3);
		boolean same1 = s2.equalsIgnoreCase("abd");
		boolean same2 = s3.equalsIgnoreCase("aBc");  // in that method do not case sensitive
		
		System.out.println(same);
		System.out.println(same1);
		System.out.println(same2);
		
		System.out.println("*******************************************");
//3. .concat ("String / String value")  and append ("String / String value") --- concatenation (addition) are happen
		
		   String s4 = "abc";  // 1 type -it is "immutable" i nature --(bcz existing string not change)
		
		    s4.concat("def");            // here existing string will not be change after performing (concatenation) operation.
		//  s4= s4.concat("def"); // in that 1st s4 is vanish create new s4 of value "abcdef"
		    String t = s4.concat("def");  // if want to change existing string then it stored in different variable. but in that s4 are safe & create t as "abcdef"
		
		    System.out.println("output of string is:"+s4); //abc
		    System.out.println("output of string t is:"+t);   //abcdef
//3.1 .append("string/ string value ")	
		  StringBuffer sb = new StringBuffer("abc"); // 2 type -- it is mutable in nature ---(bcz existing string is change)
		
		    sb.append("def");                  // but here existing string will be change after performing operation (append).
		
		    System.out.println("output of string Buffer is:"+sb); //abcdef
//3.2  .length() ---- cal total no latter in string 
		    int t1 = sb.length();
		    System.out.println(t1);
		    
	   System.out.println("*******************************************");
	   
// 4 .charAt(int index value) -- which index value/position hold which char
	     String s5 = "asdfgth";
	   
	     char ch = s5.charAt(4);  // index value start from 0 1 2 like
	    // System.out.println(s5.charAt(4)); // 1st way
	     
	     System.out.println(ch);           // 2nd way
	     
	     // System.out.println(s5.charAt(7));  // 7 is not hold any char so it gives exception == StringIndexOutOfBoundsException:- String index out of range: 7
	   
	   System.out.println("*******************************************");
	   
//5 .subString (int begins Index value) or .subString (int beginsIndex, int endIndex) -- Break the string 
	     
	     String s6 = "erhgjki";
	     
	     String subs = s6.substring(3);  //1.Break the string of index --3 == gjki o/p
	     System.out.println(subs);
	     
	     String subs1 = s6.substring(2, 5); //2. Break the string of index-- 2 upto 5 == hgj o/p
	     System.out.println(subs1);
		
	   System.out.println("*******************************************");
	    
//6 .replace(old char, new char) / replace (old seq, new seq) --it replace the one char/sequence to anther char/sequence
	    
	    String s7 = "abcabcacdabc";
	     String rep = s7.replace('a','z');  // replace char
	    System.out.println(rep);
	    
	    String rep1 = s7.replace("bc", "ZX");
	    String rep2 = s7.replace("ca", "   ");
	    System.out.println(rep1);    // replace sequence
	    System.out.println(rep2);
		
	   System.out.println("*******************************************");
	
//7 .contains(char sequence)--it is check the presence of value/char in given string. and give the boolean value
	   
	    String s8 = "asdfrljghu";
		  boolean ispresent = s8.contains("rl"); // if we give the space("r l") like then it is false,
		  boolean ispresent1 = s8.contains("mn");//in that only check sequence/single char in one time but no of char do not check at a time.
		  System.out.println(ispresent);
		  System.out.println(ispresent1);
		  
	  System.out.println("*******************************************"); 

//8 .trim() -- remove the space on "start and end" of string. but not the in between the word
	      
	     String s9 = "         vishal        ";
	     System.out.println(s9);   // with space
	     
	     String trm = s9.trim();
	     System.out.println(trm);   //without space
	     
	  System.out.println("*******************************************"); 
	  
//9 .indexOf(char)-- it gives the index value of char in a string
	  
	     String s10 = "adljfdykf";
	     int indexval = s10.indexOf('f'); // if here have multiple f then it give 1st f & show it index value
	     System.out.println(indexval);
	     
     System.out.println("*******************************************"); 
	  
//10 .toUpperCase() -- it convert the lower case string to upper case.
     
         String s11 = "vishal shinde";
         
         String upc = s11.toUpperCase();
         System.out.println(upc);
         
      System.out.println("*******************************************");  
      
//11  .toLowerCase ()---it convert the Upper case string to lower case.
	  
          String s12 = "ABCDEFGH";
         String lwc = s12.toLowerCase();
	    System.out.println(lwc);
      
	 System.out.println("*******************************************");
	 
//12 .startsWith(string value)-- it provide the boolean value of starting of method
	 
	   String s13 = "abcdefgh";
	   boolean start = s13.startsWith("a b"); // false bcz "a space b" are input 
			 System.out.println(start);
			  
	 System.out.println("*******************************************");
			 
//13 .endsWith(string value)-- it provide the boolean value of ending of method
			      
	     String s14 = "abcdefgh";  
          boolean end = s14.endsWith("h");
         System.out.println(end);
         
      System.out.println("*******************************************");   
// replaceAll()--to remove special char in given string         
         String s15 ="vfls@#%A$1&124H^UID";
         String spchar = s15.replaceAll("[^a-zA-Z0-9]", ""); //it  regular expression [ragex] method in that ^ this work like not operator 
         
         System.out.println(spchar);
         
        String spchar1 = s15.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(spchar1);
        
       System.out.println("*******************************************");  
       
// split(String d) --> this method is return the String[]
       //REverse the string         
       
       String rv = "This is an the String";
       
      String[] splitedstring = rv.split(" ");
      
    int size = splitedstring.length;
    System.out.println(size);
         
      String revers ="";
      
      for (int i=(size-1); i>=0;i--) {
    	  revers= revers+" "+splitedstring[i];
      }
         System.out.println(revers);
	}
	
		
}
