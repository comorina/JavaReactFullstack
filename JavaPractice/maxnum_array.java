package JavaPractice;
import java.util.stream.*;
import java.util.*;
public class maxnum_array {
   public static void main(String[] args) {
    List<Integer> myList=Arrays.asList(10,12,98,99,100);
    int max =  myList.stream()
    .max(Integer::compare)
    .get();
System.out.println(max);                    
}
}
