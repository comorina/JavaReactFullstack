package JavaPractice;
import java.util.Scanner;
public class basic {
    class employee{
        int salary;
        String name;
        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name =n;
        }
    }
public static void main(String[] args) {
    employee Vivek = new employee();
    Vivek.setName("Vivek is Good boy");
    Vivek.salary=1222;
    System.out.println(Vivek.getSalary());
    System.out.println(Vivek.getName());
        
    
}    
}
