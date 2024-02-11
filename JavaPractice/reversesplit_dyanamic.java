package JavaPractice;

import java.util.Scanner;

public class reversesplit_dyanamic {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("Enter the String");
    str=sc.nextLine();
    String[] a=str.split("");
    for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+"");
    }
}
    
}
