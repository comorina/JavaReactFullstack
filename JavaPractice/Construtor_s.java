package JavaPractice;
import java.util.Scanner;
class stu{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    stu(stu s2){// copy construtor
        this.name=s2.name;
        this.age=s2.age;
    }
    stu(){

    }

}
public class Construtor_s {
    public static void main(String[] args) {
        stu s1=new stu();
        s1.name="Vivek";
        s1.age=24;

        stu s2=new stu(s1);
        
        s2.printinfo();

    }
    
}
