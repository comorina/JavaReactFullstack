package JavaPractice;

public class sortindecendingorder {
    public static void main(String[] args) {
        int[] arr=new int[]{5,2,3,1,8};
        int temp=0;
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elementof array sorted is descending order");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
