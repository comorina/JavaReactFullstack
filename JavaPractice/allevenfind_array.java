package JavaPractice;
import java.util.Scanner;
public class allevenfind_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the index " + i + ":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println("even result ");
                System.out.println(+arr[i]);
            }
            else {
                System.out.println("odd in result "); 
                System.out.println(+arr[i]);
            }
        }
       
    }
    
}
