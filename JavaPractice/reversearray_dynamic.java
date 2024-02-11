package JavaPractice;
import java.util.Scanner;
public class reversearray_dynamic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the original array:");
        for(int i=0; i<size;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(" Reverse array:");
        for(int i=arr.length-1;i>=0;i--){
            
            System.out.println(arr[i]+"");
        }
    }
    
}
