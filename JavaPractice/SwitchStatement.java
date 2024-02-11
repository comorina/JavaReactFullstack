package JavaPractice;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x= s.nextInt();
        System.out.println("Enter the second number");
        int y=s.nextInt();
        
        if(x==y){
            System.out.println(x+ " and " +y+ " are equal ");
        }    
    
        else{
            System.out.println(x+ " and " +y+ " are not equal ");
        }
         
    }
}
    
     
    

