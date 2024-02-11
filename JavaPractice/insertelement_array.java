package JavaPractice;
import java.util.Scanner;
public class insertelement_array {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Java Program to insert the element");
     System.out.println("Enter the size of Array");
     int size=sc.nextInt();
     int arr[]=new int[size+1];
     for(int i=0;i<size;i++){
        System.out.println("Please give the value for index" +i+ ":");
        arr[i]=sc.nextInt();
     }   
     System.out.println("Enter the element to insert at end:");
     arr[size]=sc.nextInt();
     System.out.println("Array After inserting "+arr[size]+"at end");
     for(int i=0;i<size+1;i++){
     System.out.println(arr[i]);
    }
} 
}
