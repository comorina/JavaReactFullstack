package JavaPractice;

import java.util.Scanner;
import java.util.Arrays;
public class subarray_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array that is created:");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the element of the Arrays:");
            for(int i=0;i<size;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the required sum:");
            int reqsum=sc.nextInt();
            System.out.println("The Array created is:"+Arrays.toString(a));
            System.out.println("Sub Arrays whose sum is:"+reqsum);
            for(int i=0;i<a.length;i++){
                int sum=0;
                for(int j=1;j<a.length;j++){
                    sum+=a[j];
                    if(sum==reqsum){
                        System.out.println(Arrays.toString(Arrays.copyOfRange(a,i,j+1)));
                    }
                }
            }
    }
    
}
