package JavaPractice;

public class pra_ti {

  static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  //for (int i = 0; i < n; i++) {
      //for (int j = 0; j < n - i; j++) {
        //System.out.print("*");
      //}
    //  System.out.println();
  //  }
  

  // }
  // static void pattern_rec(int n){
  // if(n>0){
  // pattern_rec(n-1);
  // for(int i=0;i<n;i++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // }

  public static void main(String[] args) {
    pattern(4);

  }
}
