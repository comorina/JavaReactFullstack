package JavaPractice;
import java.util.Arrays;

public class arrayssum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
      
        for(int i=0;i<arr.length;i++){
            if(arr[i]==4){
                arr[i]+=1;
                
            }
            
              
        }
        System.out.println(Arrays.toString(arr)); 
        
        
    }
    
}
