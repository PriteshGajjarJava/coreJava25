import java.util.*;
class StreamFunctions {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,-3,4,5};
    
        System.out.println("Arr1-all positive:" + Arrays.stream(arr1).allMatch(e -> e>=0));  
        System.out.println("Arr2-all positive:" + Arrays.stream(arr2).allMatch(e -> e>=0));  
        
        int[] num = { 1, 2, 3, 1, 2, 4, 5, 4};
        int[] unique = Arrays.stream(num).distinct().toArray();
        System.out.println("Unique ele: " + Arrays.toString(unique));
    }
}
