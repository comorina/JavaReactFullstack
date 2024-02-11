package JavaPractice;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set= new HashSet<>();
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //search
        if(set.contains(1)){
            System.out.println("Set contains:");
        }
        if(!set.contains(6)){
            System.out.println("does not contains");
        }
       // delete
      if(set.remove(1)){
        System.out.println("delete");
      }
      //size
      System.out.println("Size of set is:"+set.size());
      // Print all element
      System.out.println(set);
      //Iterator
      Iterator d= set.iterator();
      while(d.hasNext()){
        System.out.println(d.next());

      }

    }
}
