package JavaPractice;
import java.util.*;
public class oddinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the array number:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i=i+2){
            System.out.println("Odd number:"+arr[i]);
        }
    }
    
}
