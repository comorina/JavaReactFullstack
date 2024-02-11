package JavaPractice;

import java.util.Scanner;

public class palidrome1_num {
public static void main(String[] args) {
    String r="";
    String n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String/num for check palidrome");
      n=sc.nextLine();
   int length=n.length();
    for(int i=length-1;i>=0;i-- ){
        r+=n.charAt(i);
        if(n.equals(r)){
            System.out.println("Enter the String/num is a palidrome:");
        }
        else{
        
            System.out.println("Enter the String/num is not palidrome:");
        
    }
}    
}
}

