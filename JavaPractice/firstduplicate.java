package JavaPractice;

import java.util.Scanner;

public class firstduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
                if(arr[i]==arr[i+1]){
                    System.out.println(arr[i]+ " is first duplicate number:");
                    break;
                }
                if(i==(size-2)){
                    System.out.println("No duplicate number");

                }
        }
    }
    
}
