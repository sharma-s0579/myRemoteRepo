 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();

	  //Calling isPalindrome method and printing the results 
	  String str = "";
	  Scanner input2 = new Scanner(System.in);
	  System.out.println("Enter a string:");
	  str = input2.nextLine();
	  boolean palindrome = isPalindrome(str);
		if(palindrome) {
			System.out.println("Yes, it is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }

	//To check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		
		str = str.toLowerCase();
		
	 // if length is 0 or 1 then String is palindrome
        if(str.length() == 0 || str.length() == 1)
            return true; 
        
        if(str.charAt(0) == str.charAt(str.length()-1))
        	
        	return isPalindrome(str.substring(1, str.length()-1)); //recursive call
       	 	
        else
        	return false;
	
}

}
