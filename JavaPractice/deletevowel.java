package JavaPractice;
import java.util.*;
public class deletevowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String s2="";
        s2=s1.replaceAll("[AEIOUaeiou]","");
        System.out.println("String after the vowel :"+s2);
    }
}
    

