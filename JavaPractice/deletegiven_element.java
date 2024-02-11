package JavaPractice;
import java.util.Scanner;
public class deletegiven_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int loc;
        System.out.println("Delete the element in the array:");
        System.out.println("Enter the size of element:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the location:");
            loc=sc.nextInt();
            for(int i=loc;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            for(int i=0;i<size;i++){
                System.out.println(arr[i]+"");
            }
            }
        }
    
    

