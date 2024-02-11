package JavaPractice;

import java.util.Scanner;

public class whitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        str=str.replaceAll("\\s", "");
        System.out.println("String after the removing all whites spaces:" +str);
    }
    
}
