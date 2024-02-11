package JavaPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class location_delete {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(5);
        arr.add("Vivek");
        arr.add("Shivam");
        arr.add("Kush");
        arr.add("Aadrash");
        arr.add("Satvik");
        System.out.println("The list of the size is :"+arr.size());
        for(String name:arr){
        System.out.println("Name :"+name);
    }
    arr.remove(2);
    System.out.println("After the removing the element the size of the arraylist is :" +arr.size());
    for(String name:arr){
        System.out.println("Name is :" +name);
    }
}
}