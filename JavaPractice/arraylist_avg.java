package JavaPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist_avg {
    public static void main(String[] args) {
        int sum=0;
        int avg;
      List<Integer>list=Arrays.asList(10,20,30,40,50,60,70,80); 
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);
        // list.add(70);
        // list.add(80);
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
           
        }
        avg=sum/list.size();
        System.out.println("The average of the list:"+avg);
    }
     
}
