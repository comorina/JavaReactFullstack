package JavaPractice;
import java.util.*;
import java.io.BufferedReader;  
import java.io.FileReader;  
public class countwordfiles {
    public static void main(String[] args) throws Exception{
        String line;
        int count= 0;
        FileReader file=new FileReader("data.txt");
        BufferedReader br= new BufferedReader(file);
        while((line=br.readline())!=null){
            String word[]=line.split("");
            count =count+word.length;
        }
        System.out.println("Number of words present in given files:" +count);
        br.close();
        
    }
    
}
