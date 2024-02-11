package JavaPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Shivam");

        String name = "Shivam";
        String reverseName = "";

        for (int i=1; i<=name.length(); i++){
            reverseName = reverseName+name.charAt(name.length()-i);
        }
          System.out.println(reverseName);
            Scanner scan=new Scanner(System.in);
            System.out.println("");
                 int day=scan.nextInt();
            System.out.println(day);
    }
}
