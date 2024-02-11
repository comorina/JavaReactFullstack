package JavaPractice;

import java.util.*;

public class uniquechar_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character>unique=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(unique.contains(ch)==true){
                unique.remove(ch);
            }
            else{
                unique.add(ch);
            }
        }
        if(unique.size()==0){
            System.out.println("There are no unique character: ");
        }
        for(Character ch:unique){
            System.out.println(ch+"");
        }
    }
    
}
