package JavaPractice;
import java.util.*;
public class imp2_interview {
    public static void  reverse(int a[],int n){
        int b[]=new int[n];
        int j=n;
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j--;
        }
        System.out.println("Reverse array is:\n");
        for(int k=0;k<n;k++){
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        reverse(a,a.length);
        
    }
    
}
