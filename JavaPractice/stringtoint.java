package JavaPractice;
import java.util.Scanner;
public class stringtoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String n=sc.nextLine();

        int i=Integer.parseInt(n);
        System.out.println("Change in integer:"+i);
    }
    
}
