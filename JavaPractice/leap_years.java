package JavaPractice;
import java.util.Scanner;
public class leap_years {
    public static void main(String[] args) {
        int years;
        System.out.println("Enter the Years:");   
        Scanner sc=new Scanner(System.in);
        years=sc.nextInt();
        if((years%4==0) || (years%100==0) || (years%400==0)){
        System.out.println("Specified Years is Leap Years : ");
        }
        else{
            System.out.println("Specified Years is not Leap Years:");
        }
           
    }
}
