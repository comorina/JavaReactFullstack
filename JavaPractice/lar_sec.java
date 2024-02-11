package JavaPractice;

import java.util.Scanner;

public class lar_sec {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int largest=0;
        int secondlargest=0;
        
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
           
            else if(arr[i]>secondlargest){
                secondlargest=arr[i];
            }
           
            
        }
        System.out.println("The second largest number: "+secondlargest);
        System.out.println("THe largest number:"+largest);
        
    }
    
}
