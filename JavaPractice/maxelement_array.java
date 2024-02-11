package JavaPractice;
import java.util.Arrays;
import java.util.*;
public class maxelement_array {
    public static void main(String[] args) {
        int a[]={12,13,15,67};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                
            }
        }
        System.out.println(+max);
    }
   }
    

