package JavaPractice;
import java.util.Scanner;
public class palidromedynamic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String/number");
        String original,reverse="";
        original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        System.out.println("Reverse:" +reverse);
        if(original.equals(reverse)){
            System.out.println("The number is palidrome:");
        }
        else{
            System.out.println("The number is not palidrome:");
        }
    }
    
}
