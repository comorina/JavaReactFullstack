package JavaPractice;
import java.util.Arrays;
import java.util.Scanner;


public class non_primitive_type {
public static void main(String[] args) {
   // String name="Vivek";
    //String name1= name.replace('v', 'b');
    //System.out.println(name1);
    // substring
    //String n="Vivek and Shivam";
    //System.out.println(n.substring(6, 9));
    
    //int physic= 97;
    //int math= 100;
    //int eng= 80;
   // int[] marks=new int[3];
   // marks[0]=97;
    //marks[1]=100;
    //marks[2]=80;
    //System.out.println(marks[0]); 
    //System.out.println(marks[1]); 
    //System.out.println(marks[2]); 
      //length
  //  System.out.println(marks.length);
      //sort
    //System.out.println(marks[0]);
     //Arrays.sort(marks);
   // System.out.println(marks[0]);
   //int[] mark ={97,98,95};
   //int[][] finalMarks={{97,98,99},{96,76,90}};
  //  System.out.println(finalMarks[1][1]);
    // casting in implicit
    //double price=100.00;
    //double finalPrice=price+18;
   // System.out.println(finalPrice);


    //int p=100;
    //int fp=p+18.0;// wroung bcz int type byte is smaller than the double byte
    // but explicit
    //int fp=p+(int)18.18;
    //System.out.println(fp);
    // constants
    //int age =30;
    //age=31;
    //age=32;
   //final float PI=3.14F;
    //PI=1.1F;//not error bcz not use final keyword 
    //for the error final keyword use

    //Operators
    //double a=1;
    //double b=2;
    //double div=a/b;
  // System.out.println(div);
  //int n1=1;
  
  //System.out.println(n1);
  //System.out.println(n1++);//1
  //System.out.println(n1); //2
  
  //System.out.println(++n1);//2
  //System.out.println(n1);//2
  
  // Maths
  //System.out.println(Math.min(5, 6));
  //System.out.println(Math.min(2, 3));
  //  random
  //System.out.println((int)(Math.random()*100));
  // How to take Input
  //Scanner sc=new Scanner(System.in);
    //System.out.println("Enter your Name");
    //String name =sc.nextLine();
    //System.out.println("My name:" +name);
    // Conditional statements
   //Scanner sc1=new Scanner(System.in);
 //int cash=sc1.nextInt();
 //if(cash<10){
    //System.out.println("Cannot buy anything");
   // System.out.println("Can get 1 thing");
 //}
 //else if(cash>10 && cash<50){
    //System.out.println("Can get 1 thing");
 //}
 //else{
    //System.out.println("can get both");
 //}
 // loops
 //for(int i=1;i<=100;i++){
    //System.out.print(i);
// }
 // while loop
 //int i=100;
 //while (i>=1) {
   // System.out.println(i);
    //i=i-1;   
    
    //do while loop
    int i=100;
    do{
        System.out.println(i);
        i=i-1;
    }
    while(i>=1);

 }

   
}    

