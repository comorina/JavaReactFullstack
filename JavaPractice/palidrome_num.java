package JavaPractice;

import java.util.Scanner;

public class palidrome_num {
    public static void main(String[] args) {
        String n, r = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
        n = in.nextLine();   
      int length = n.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         r = r + n.charAt(i);  
      if (n.equals(r)) { 
         System.out.println("Entered string/number is a palindrome."); 
      } 
      else  {
         System.out.println("Entered string/number isn't a palindrome.");
        }


    }
}

        