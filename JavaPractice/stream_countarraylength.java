package JavaPractice;
import java.util.stream.*;
import java.util.*;
public class stream_countarraylength {
    public static void main(String[] args) {
        List<Integer> myList =Arrays.asList(10,15,20,30,40,50);
        long count=myList.stream()
            .count();
            System.out.println(count);

    }
    
}
