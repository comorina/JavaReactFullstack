package JavaPractice;

public class Selection_sort {
    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int[] arr={7,8,3,2,1};
// selection sort
        for(int i=0;i<arr.length-1;i++){
    int smallest=i;
                for(int j=1;j<arr.length;j++){
                    if(arr[smallest]>arr[j]){
                        smallest=j;
                    }
                }
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        }
        printarr(arr);

}
    
}
