package JavaPractice;

import java.util.Scanner;

public class fibonacciseries_recursion {
    public static int recursion(int count){
        if(count==0){
            return 0;
        }
        if(count==1 || count==2){
            return 1;
        }
        else{
        
        return recursion(count-1)+recursion(count-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
       
        System.out.println("Fabseries  "+n+"  num is:");
            for(int i=0;i<n;i++){
                System.out.println(recursion(i)+"");
            }
    }
    
}
