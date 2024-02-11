package JavaPractice;
import java.util.Scanner;

public class reversre_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Reverse Array:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+ "");
        }
    }
    
}

