package exceptionhandaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategoryException {          // error show in at compile time mean check category exception
	
	public static void main(String[] args) {
		 
		System.out.println("Befor Exception");
		
		try {
			FileInputStream fis = new FileInputStream("F:\\Testing Automation\\New folder\\Exception handling.docx"); // shift + right clik = copy path
		}
		catch (FileNotFoundException e) {              // if path is not correct then catch is run but here is a path is correct.
			System.out.println("file path is incorrect");
			
		}
		System.out.println("After exception handling");
		
		try {
			Thread.sleep(5000);    // 5000 is millis second that time code be sleep for execution
		}
		catch (InterruptedException e) {               // if we want delay the code run then this exception use.
			System.out.println("interrupted exception is runnig");
			
		}
		System.out.println("After thread. sleep");    // it will be run after 5 sec.
	}
}
