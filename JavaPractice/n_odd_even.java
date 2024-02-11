package JavaPractice;

import java.util.Scanner;

public class n_odd_even {
    public static void main(String[] args) {

        int n = 0;
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n % 2 == 0 && n > 20) {
            System.out.println("Not Werid");
        } else if (n % 2 == 0 && (n > 6 && n < 20)) {
            System.out.println("Werid");
        } else if (n % 2 == 0 && (n > 2 && n < 5)) {
            System.out.println("Not Weridd");
        } else {
            System.out.println("Weirdd");
        }

    }
}
