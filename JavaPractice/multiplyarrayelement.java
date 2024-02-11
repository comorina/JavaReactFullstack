package JavaPractice;
import java.util.*;
public class multiplyarrayelement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr=new int[size];
        int multiply=1;
        for(int i=0;i<size;i++){
            System.out.println("Enter the index: " +size+ ":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            multiply=multiply*arr[i];
        }
        System.out.println("Multiply of the element of an array:" +multiply);

    }
    
}
