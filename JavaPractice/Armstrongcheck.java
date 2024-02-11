package JavaPractice;
import java.util.*;
public class Armstrongcheck {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int originalnumber,remainder,result=0;
        originalnumber=n;
        while(originalnumber!=0){
            remainder=originalnumber%10;
            result+=remainder*remainder*remainder;
            originalnumber=originalnumber/10;

        }
        if(result==n){
            System.out.println(n+ ": is an Armstrong number:");
        }
        else{
            System.out.println(n+ ": is not an Armstrong number:");
        }


    }
}
        