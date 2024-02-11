package JavaPractice;
import java.util.Scanner;
public class reversedynamic_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String n=sc.nextLine();
        String reverse="";
        System.out.println("Reverse String:");
        for(int i=n.length()-1;i>=0;i--){
           reverse+=n.charAt(i);
        }
        System.out.println("Result:"+reverse);


    
    }
    
}
