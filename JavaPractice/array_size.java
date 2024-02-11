package JavaPractice;
import java.util.*;
public class array_size {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // int size=sc.nextInt();
    // int num[]=new int[size];
    // for(int i=0;i<size;i++){
    //     num[i]=sc.nextInt();
    // }
    // for(int i=0;i<size;i++){
    //     System.out.println(num[i]);
    // }
    int[] arr={0,0,1,1,2,2,3,3,4,};
    int n=arr.length;
    int[] temp=new int[arr.length];
    int j=0;
    for(int i=0;i<n-1;i++){
       if(arr[i]!=arr[i+1]){
        temp[j]=arr[i];
        j++;
       }
       
    }
    temp[j]=arr[n-1];
    j++;
       for(int k=0;k<j;k++){
        System.out.println(temp[k]);
       }
}    
}

