package JavaPractice;

import java.util.Scanner;

class pen {
    String color;
    String type; // BallPoint, gell

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }

}

public class Pen_opps {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "Gell";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "BallPoint";
        pen1.write();
        pen2.write();
        pen1.printColor();
        pen2.printColor();
        pen1.printType();
        pen2.printType();

    }

}
