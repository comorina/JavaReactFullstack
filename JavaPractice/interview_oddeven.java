package JavaPractice;

import java.util.Scanner;

public class interview_oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
       int n=sc.nextInt();
       if(n%2==0){
        System.out.println("Enter number is even");
       }
       else{
        System.out.println("Enter number is odd");
       }
    }
    
}
