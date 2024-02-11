package JavaPractice;
import.java.*;
public class array_remove {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,2,3,3,4};
        int n=arr.length;
        int temp[]=new int [arr.length];
        int j=0;
       for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1]){
            temp[j++]=arr[i];
           

        }
       }
       temp[j++]=arr[n-1];
       for(int k=0;k<j;k++){
        System.out.println(temp[j]);
       }
    
}
    
}
