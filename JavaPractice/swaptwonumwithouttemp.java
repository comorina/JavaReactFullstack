package JavaPractice;
import java.util.Scanner;
public class swaptwonumwithouttemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("Strings before swapping:"+str1+ " "+str2);
        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());

        System.out.println("String after swapping:"+str1+" "+str2);
    }
    
}
