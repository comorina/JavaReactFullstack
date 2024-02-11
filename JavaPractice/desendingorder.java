package JavaPractice;

import java.util.Scanner;

public class desendingorder {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element in array:");
        for(int i=0;i<size;i++){
            
            arr[i]=sc.nextInt();
           
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Element  of array sorted in ascending order:");
        for( int i=0;i<size;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    
}
