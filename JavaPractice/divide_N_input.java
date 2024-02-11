package JavaPractice;

public class divide_N_input {
    public static void main(String[] args) {
        String str="aaabbbccc";
        int len=str.length();
        int n=3;
        int temp=0,chars=len/n;
        String[] equalstr=new String[n];
        if(len%n!=0){
            System.out.println("Sorry the String cannot be divide into"+n+"equal parts:");
        }
        else{
            for(int i=0;i<len;i=i+chars){
                String part =str.substring(i, i+chars);
                equalstr[temp]=part;
                temp++;
            }
            System.out.println(n+ "equal parts of given string");
            for(int i=0;i<equalstr.length;i++){
                System.out.println(equalstr[i]);

            }
        }
    }
    
}
