package JavaPractice;
public class imp1_interview {
    public static int count(String x,char c){
        int res=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==c){
                res++;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        String x="VivekisVivekVivek";
        char c='V';
       System.out.println(count(x,c));
    }
    
}
