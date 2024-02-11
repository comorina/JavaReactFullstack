package JavaPractice;
import java.util.Scanner;
public class largest_numarr {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num of array");
    int n =sc.nextInt();
    int[] arr=new int[n];
    int max=arr[0];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }    
    System.out.println("Largest number:"+max);
    }
    
}
