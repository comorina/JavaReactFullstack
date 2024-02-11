package JavaPractice;
import java.util.Scanner;
class tu{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+ "  " +age);
    }
}

public class poly_morphism {
    public static void main(String[] args) {
        tu s1= new tu();
        s1.name="Vivek";
        s1.age=24;

        s1.printInfo(s1.name,s1.age);
        
    }
    
}
