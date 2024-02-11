package JavaPractice;

import java.util.Scanner;

public class project_guessnumber {
    public static void main(String[] args) {
       
    int usernum=0;
    Scanner sc= new Scanner(System.in);
    int myNum= (int)(Math.random()*100);
    do{
        System.out.println("Guess my Number");
        usernum=sc.nextInt();
        if(usernum==myNum){
        System.out.println("Woow CORRECT NUMBER");
        break;
    }
    else if(usernum>myNum){
        System.out.println("Your num is largest");
    }
    else{
        System.out.println("Your num is small");
    }
}
    while(usernum>=0);
    System.out.print("My num was:  ");
    System.out.println(myNum);
}
}


