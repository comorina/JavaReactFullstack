package JavaPractice;
import java.util.*;
public class String_me {
    public static void main(String[] args) {
        // concatenation
        String firstname="Tony";
        String lastname="stark";
        String fullname=firstname+lastname;
        System.out.println(fullname.length());
        // charAt()
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        /* compare - case 1-s1>s2
                     case 2- s1=s2
                     case 3- s1<s2
        */

        String name1="Tony";
        String name2="Tony2";
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }


        
    }
    
}
