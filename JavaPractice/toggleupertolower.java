package JavaPractice;

import java.util.*;

public class toggleupertolower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder res = new StringBuilder("");

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i); //current character
            if(ch >='A' && ch <= 'Z') {
                res.append((char)(ch + 32));
            } else if(ch >='a' && ch<='z'){
                res.append((char)(ch - 32));
            } else { 
                res.append(ch);
            }
        }

        String ans = res.toString();
        System.out.println("The string after toggling becomes: " + ans);
	}
}
