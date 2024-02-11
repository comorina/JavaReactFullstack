package JavaPractice;
import java.util.Scanner;
public class reversestringdynamic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String n=sc.nextLine();
        String reverse="";
        for(int i=n.length()-1;i>=0;i--){
            reverse+=n.charAt(i);
        }
        System.out.println("Original string:" +n);

        System.out.println("Reverse of given string:"+reverse);
    }
    
}
