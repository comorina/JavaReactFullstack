package JavaPractice;

import java.util.HashMap;

public class romaninteger {
    public static void romi(String s){
        HashMap<Character, Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        int num=0;
        for(int i=0;i<s.length();i++){
            num+=map.get(s.charAt(i));
        }
        System.out.println("The integer value is:"+num);

    }
    public static void main(String[] args) {
        romi("MCMX");
    }    
}
