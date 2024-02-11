package JavaPractice;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        float p,t,r,SI;
        System.out.println("Programm to calculate Simple Interest:");
        Scanner sc =new Scanner(System.in);
        System.out.println("Please give Principle ammount");
        p=sc.nextFloat();
        System.out.println("Please give time duration:");
        t=sc.nextFloat();
        System.out.println("Please give the rate of interest:");
        r=sc.nextFloat();
        SI=(p*r*t)/100;
        System.out.println("Simple Interest:"+SI);
    }
    
}
