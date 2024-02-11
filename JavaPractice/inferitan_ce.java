package JavaPractice;
import java.util.Scanner;
class shape{// base class or parent class
    public void area(){
        System.out.println("Display area");
    }
}
class triangle extends shape{//sub class or child class
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
class equlateraltriangle extends triangle{//Multilevel inheritence
    public void area(int l,int h){
        System.out.println(1/2*l*h);
}
class Circle extends shape(){
    public void area(int r){
        System.out.println((3.14)*r*r);// Hierarical 
    }
}


}
public class inferitan_ce {
    public static void main(String[] args) {
        triangle t1=new triangle();
     
       
    }
    
}
