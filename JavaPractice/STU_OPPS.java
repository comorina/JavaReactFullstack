package JavaPractice;

import java.util.Scanner;




class Radhe {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class STU_OPPS {
    public static void main(String[] args) {
        Radhe s1 = new Radhe();
        s1.name = "Vivek";
        s1.age = 24;
        s1.printinfo();
    }
}
