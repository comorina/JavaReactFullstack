package JavaPractice;
import java.util.Scanner;
public class insert_arrayelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array of size");
        int size=sc.nextInt();
        int[] arr=new int[size+1];
        for(int i=0;i<size;i++){
            System.out.println("Index "+i+ ":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Added element in last index:");
        arr[size]=sc.nextInt();
        System.out.println("After the insert " +arr[size]+ "at end:");
        for(int i=0;i<size+1;i++){
            System.out.println(arr[i]);
        }

    }
    
}
