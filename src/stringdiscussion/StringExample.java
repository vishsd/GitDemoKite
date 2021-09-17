package stringdiscussion;


public class StringExample {
	
	public static void main(String[] args) {
		
//1 write a given string in separator line 
		
	  String s = "sgjftyru";
	 
	  int s1 = s.length();
	
	    for (int i=0; i<=(s1-1); i++) {   // here length =8 & index value = 0-7 so we can use (i<length(s1)) or (i<=(length(s1)-1))
		char ch = s.charAt(i);
		System.out.println(ch);
	    }
   System.out.println("*****************************************");
//2 break the string of f	but index value of f is not known 	
      
        String s2 ="askjftlgnm";
            int indexval = s2.indexOf('f');  // 1st cal index value of f
            System.out.println(indexval);  // o/p 4
            
            String sb = s2.substring(4);   // then using f index value then break string 
            System.out.println(sb);
		
    System.out.println("*****************************************");
//3 reverse the given string   
    
        String s3 = "abcdefgh";
               
       int j = s3.length();
       System.out.println(j);
       
       String rev= "";
       
       for (int i =(j-1); i>=0;i--) {
    	   char ch1 = s3.charAt(i);
//    	     System.out.print(ch1);
    	   rev = rev + ch1;
        }
       
  	 System.out.println(rev);

    System.out.println("*****************************************");
    
//3.1 REverse the string (statement)        
    
    String rv = "This is an the String";
    
   String[] splitedstring = rv.split(" ");
   
 int size = splitedstring.length;
 System.out.println(size);
      
   String revers ="";
   
   for (int i=(size-1); i>=0;i--) {
 	  revers= revers+" "+splitedstring[i];
   }
      System.out.println(revers);
     
      System.out.println("*****************************************");
      
//4 remove the space in between the string and start and end of string.
    
        String s4 = "    velo   city    ";
        
         String trm = s4.trim();
         System.out.println(trm);
        
        System.out.println(trm.replace(" ","")); // only this using ans will be shown
        
     System.out.println("*****************************************"); 
    
    
    
    }

}
