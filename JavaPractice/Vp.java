package JavaPractice;

import java.util.Scanner;

public class Vp {
  //static int sum(int a, int b){
    //return a+b;
  
    public static void main(String[] args) {
        

    /* Rules for constructing name of variabales in Java
    1.Can contain digits,underscores,dollar signs,letters
    2.Should begin with a letter ,$ or _ 
    3. Should not contain whitespaces
    4. You cannot use reserved keywords from Java
     */
     /* Two types of Java Data Types:
      Primitive- byte(1 byte), short(2 bytes),int(4 bytes),long(8 bytes),float(4 bytes),
     double(8 bytes), boolean(1 bytes), char(2 bytes) 
     
      */
      //byte u=56;
    //  double a=43.45345d;
    //System.out.println(u);
    //System.out.println(a);
  //      char grade='A';
  //  System.out.println(grade);
/* 
 Non Primitive or Reference Data Type-after
 */
/* Operators in Java
 Types of Operators in Java
  Arithmetic Operators
  Assignment Operators
  Logical Operators
  Comparison Operators
 */
//int num1=45, num2=100;
//System.out.println("The Value of num1 + num2");
//System.out.println(num1+num2);
//System.out.println(num1++);
//System.out.println(++num1);
//System.out.println(num1--);
//System.out.println(--num1);
/*
 Comparsion Operators
 1.== - Check for equality of two values
 2.!= - Check if two values are not equal
 3.<
 4.>
 5.<=
 6.>=
 */
/*
 Logical Operators
 1.&& - Logical and operator - returns true only if both conditions are ture
 2.|| - Logical or operator  - returns true if any one condition is true
 3.! - Logical not -  Reverse the result from true to false and vice versa
 */
// Taking user input in Java
//Scanner scan=new Scanner(System.in);
//System.out.println("Enter Input");
//String input= scan.nextLine();
//System.out.println(input);

//String namee= "Vivek";
//String channel=" good boy";
//System.out.println(namee +  "is" +channel);
//System.out.println(namee.length());
//System.out.println(namee.toUpperCase());
//System.out.println(namee.toLowerCase());
//System.out.println(namee+ "is\"" + channel);
//System.out.println(namee.contains("Viv"));
//System.out.println(namee.charAt(2));
//System.out.println(namee.indexOf("ek"));
//System.out.println(namee.indexOf("edk"));
// Maths 
//int x=5, y=8;
//System.out.println(Math.max(x,y));
//System.out.println(Math.min(x,y));
//System.out.println(Math.sqrt(36));
//System.out.println(Math.abs(-36));
//System.out.println(Math.abs(6));
//System.out.println(4+(8-4)*Math.random());

// If- else conditionals
 //Scanner scan=new Scanner(System.in);
 //System.out.println("Enter day");
 //int day=scan.nextInt();
 //System.out.println(day);
//if(age>20){
  //  System.out.println("You are adult");
//}
//else if(age>5){
   // System.out.println("You are not a kid");
//}
//else{
  //  System.out.println("You are a kid");
//}
// Switch Statement in Java
 //switch(age){
    //case 12:
    //System.out.println("you are 12 years old");
    //break;
    //case 56:
    //System.out.println("you are 56 years old");
    //break;
    //case 16:
    //System.out.println("you are 16 years old");
    //break;
    //default:
   // System.out.println("you did not match any of the case");
 //}
 // Print sunday to saturday based on numbers 1 to 7 typed by the user
//switch(day){
  //  case 1:
   // System.out.println("Sunday");
    //break;
    //case 2:
    //System.out.println("Monday");
    //break;
    //case 3:
    //System.out.println("TUESDAY");
    //break;
    //case 4:
    //System.out.println("Wednesday");
    //break;
    //case 5:
   // System.out.println("Thursday");
    //break;
    //case 6:
    //System.out.println("Friday");
    //break;
    //case 7:
  //  System.out.println("Saturday");
    //break;
    //default:
   // System.out.println("not a day");
//}
    //Loop 
    /*
     While loop 
     while(condition)
     */

//int i=0;
//while(i<100){
  //  System.out.println(i);
    //i+=1;
//}
     // do while loop
//int j=0;
//do{
  //  System.out.println(j);
    //j +=1;
//}while(j>100);
        /* For Loop
        for(st1;st2;st3;){

        } 
        */  
        //for(int i=0;i<=10; i++){
            //if(i>2){
           //break;
           //}
           //else{
           // System.out.println(i);
          // }
            
        
        //for(int j=0;j<=10;j++){
             // if(j==5){
             //   continue;
           //  }
         //   System.out.println(j);
       // }
               // Java Arrays
               //int[] marks={1,2,3,4,5};
               //marks[3]=34;// this will update marks[4]
               //System.out.println(marks[0]);
               //System.out.println(marks[3]);

// classical way to oterate an array
               //for(int i=0; i<=marks.length;i++){
               //System.out.println(marks[i]);
              // }
                //int[][] matrix={{1,2,3,},{4,5,6}};
                //System.out.println(matrix[0][1]);

                //String[] cars={"Maruti","innova","Ford"};
                //for(String value:cars){
                  //System.out.println(value);

//Try-Catch
      //String [] n_m={"vivk","shi","Aad","kus","Sat"};
      //try{
        //System.out.println(n_m[5]);
      //}
     // catch(Exception e){
    //    System.out.println(e);
  //    }
//         System.out.println("Masoom");
              
            //  System.out.println(sum(4,5));
            float number_1 ,number_2;
            System.out.println("Enter first Number");
            Scanner scan= new Scanner(System.in);
            number_1= scan.nextFloat();

            System.out.println("Enter second number");
            Scanner scan2= new Scanner(System.in);
            number_2=scan2.nextFloat();
            System.out.print("You have Entered");
            System.out.print(number_1);
            System.out.print(" and ");
            System.out.println(number_2);
            String ASMD="Enter 0 for addition,1 for subtraction, 2 for multiplication and 3 for division";
            System.out.println(ASMD);
            int input=scan.nextInt();
            switch(input){
              case 0:
              System.out.println("add");
              System.out.println("Result");
              System.out.println(number_1+ number_2);
              break;
              case 1:
              System.out.println("Subs");
              break;
              case 2:
              System.out.println("Multi");
              break;
              case 3:
              System.out.println("Division");
              break;
              default:
              System.out.println("Invalid");
            }
     }
    }

                

      
    

 
 
 



