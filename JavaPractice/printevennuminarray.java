package JavaPractice;
import java.util.Scanner;
public class printevennuminarray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the size of array :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        System.out.println("Please give the index  " + i + ":");
         arr[i]= sc.nextInt();

    }
    System.out.println("Even number in array:");
    for(int i=0;i<size;i++){
        if(arr[i]%2==0){
            System.out.println(arr[i]+"\t");
        }
    }
}
    
}
