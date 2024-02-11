package JavaPractice;
import java.util.Scanner;
public class twosize_arrayequal {
    public static void main(String[] args) {
      
      int []arr1={1,2,3,4,5};
      int []arr2={1,2,3,45,2};
     
    if(arr1.length==arr2.length){
        System.out.println("Array is equal");
    }
    else{
        System.out.println("Array is not equal");
    }
}
}
