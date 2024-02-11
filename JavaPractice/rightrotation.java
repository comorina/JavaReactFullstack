package JavaPractice;
import java.util.Scanner;
public class rightrotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java program to perform right rotation: ");
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int[] arr= new int[size];
    int temp=0;
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<2;i++){
        temp=arr[size-1];
    for(int j=size-1;j>0;j--){
        arr[j]=arr[j-1];
    }
    arr[0]=temp;
    }
    System.out.println("Array after two time right rotation:");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    
    }
    
}
