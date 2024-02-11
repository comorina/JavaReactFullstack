package JavaPractice;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int count=0;
        int a;
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            count=count+(a*a*a);
        }
        if(temp==count){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong:");
        }
    }
    
}
