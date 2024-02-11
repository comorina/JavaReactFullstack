package JavaPractice;

import java.util.Scanner;

public class vowel_consonent {
    public static boolean volcon(char ch){
    if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
        return true;
    }
        return false;
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        int volcount=0;
        int concount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(volcon(ch)==true){
                volcount++;
            }
            else if(ch>='a' && ch<='z' && volcon(ch)==false){
                concount++;
            }
        }
                
                System.out.println("Number of vowel:"+volcount);
                System.out.println("Number of consonant:"+concount);
                System.out.println("Number of symbol:"+(int)(str.length()-volcount-concount));
        
    }
    
}
