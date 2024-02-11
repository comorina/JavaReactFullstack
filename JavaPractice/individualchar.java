package JavaPractice;
import java.util.Scanner;
public class individualchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String n=sc.nextLine();
        System.out.println("Individual char from give string:");
        for(int i=0;i<n.length();i++){
            System.out.print(n.charAt(i)+ " ");
        }
    }
    
}
