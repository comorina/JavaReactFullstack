package JavaPractice;

public class selectionsortexample {
    public static void selectionsort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[index]){
                    index=j;
                }
            }
            int smallerNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNumber;
        }
    }
    public static void main(String[] args) {
        int[] arr1={9,14,3,2,43,11,58};
        System.out.println("Before selection sort");
        for(int i:arr1){
        System.out.println(i+" ");
        }
        System.out.println();
        selectionsort(arr1);
        System.out.println("After the selection sort"); 
        for(int i:arr1){
            System.out.println(i+"");
        }
    }
    
}
