package JavaPractice;

import java.util.Scanner;

public class loc_delete {
    public static void main(String[] args) {
        int loc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size-1];
        System.out.println("Enter the array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array location: ");
        loc=sc.nextInt();
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];

        }
        size--;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    
}
