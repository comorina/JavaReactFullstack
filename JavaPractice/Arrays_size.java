package JavaPractice;

import java.util.Scanner;

public class Arrays_size {
    public static void main(String[] args) {
        // Take a array as input from the user. Search for a given number x and print the index at which it occurs
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();
            for(int i=0;i<num.length;i++){
                if(num[i]==x){
                    System.out.println("x is index of: "+ i);
                }
            }
        }
    }
    

