package JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class new_pra {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        // 2 for scissor
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor");   
    int userint =sc.nextInt();
    
    Random random=new Random();
    int cumputerInput= random.nextInt(3);
    }
    
}
