package JavaPractice;

public class arraysort_ascending {
       public static void main(String[] args) {
        int a[]={2,8,5,7,9};
        int temp=0;
        System.out.println("Enter the original array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){ 
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Element of array sorted in ascending order:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }        
    }
    
}
