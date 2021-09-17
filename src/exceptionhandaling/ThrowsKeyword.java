package exceptionhandaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	
	public static void main(String[] args) throws FileNotFoundException {  // only use in check category exception not in uncheck category.
		// throws only handal compile time exception but any exception arrive then it wont be protect at abnormale exception
		
		//we also use super class of exception ex. throwable , Exception
		
          System.out.println("Befor Exception");
		
		
			FileInputStream fis = new FileInputStream("F:\\Testing Automation\\New folder\\Exception handling.docx"); // shift + right clik = copy path
		// if path is ok then no problem . but path is wrong then only compile time error  are handal do not the run time .
		System.out.println("After exception handling");
		
		
		
	}
}
