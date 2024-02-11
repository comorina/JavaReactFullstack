package JavaPractice;

public class imp_interview {
    public static void main(String[] args) {
        String x="Vivekis good boy:1234";
        int digit=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)>=48 && x.charAt(i)<=57){
                digit++;
            }
        } 
        System.out.println("This is numerical digit: "+digit);
    }
    
}
