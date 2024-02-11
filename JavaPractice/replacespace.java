package JavaPractice;

import java.util.Scanner;

public class replacespace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        char ch='-';
        str=str.replace(' ', ch);
        System.out.println("String after the replacing spaces with given character:");
        System.out.println(str);
    }
    
}
