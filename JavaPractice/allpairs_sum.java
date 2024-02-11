package JavaPractice;

import java.util.Scanner;

public class allpairs_sum {
    public static void findpairs(int[] arr,int targetsum){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==targetsum){
                    System.out.println(arr[i]+ " " +arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        int size=sc.nextInt();
        int arr[]=new int[size];
       int targetsum=14;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Pairs of integer whose sum is equal to" +targetsum+ ":");
        findpairs(arr,targetsum);
        
    }
    
}
