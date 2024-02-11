package JavaPractice;

public class puncuation {
    public static void main(String[] args) {
        int count=0;
        String str="He said,Vivek is good person.,,,,,'I heard it with my own ears";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   {
    count++; 
}
            
        }
        System.out.println("The number of punctuations exists in the String is:"+count);
    }
    
}
