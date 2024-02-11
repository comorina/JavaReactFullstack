package JavaPractice;

import java.util.Scanner;
import java.util.Arrays;

public class interview_sumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Size of Array");
        int size= sc.nextInt();
        int[]a=new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
            count+=a[i];
        }
        System.out.println("Arrays is:"+Arrays.toString(a));
        System.out.println("Sum of all numbers in the array"+count);
    }
    
}
