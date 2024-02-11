package JavaPractice;
import java.util.Scanner;

import javax.script.ScriptContext;
public class recursion1 {
    static int facc(int n){
        if(n==0){
        return 0;
    }
        if(n==1 || n==2){
            return 1;
        }
    else{
        return facc(n-1)+facc(n-2);
    }
}
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        System.out.println("Fabseries  "+x+"  num is:");
            for(int i=0;i<x;i++){
                System.out.print(facc(i)+"");

        }

        
    }
}
 

