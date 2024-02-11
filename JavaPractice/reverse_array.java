package JavaPractice;

public class reverse_array {
    public class ReverseArrayExample {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
    
            System.out.println("Original Array: ");
            printArray(array);
    
            reverseArray(array);
    
            System.out.println("\nReversed Array: ");
            printArray(array);
        }
    
        private static void reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
    
            while (start < end) {
                // Swap elements at start and end indices
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
    
                // Move towards the center of the array
                start++;
                end--;
            }
        }
    
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    
}