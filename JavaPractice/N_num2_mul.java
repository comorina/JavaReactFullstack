package JavaPractice;

import java.util.Scanner;

public class N_num2_mul {
public static void main(String[] args){
   System.out.println("Enter the table number : ");
   Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(n+" * "+i+" = "+n*i);
    }
}    
}
