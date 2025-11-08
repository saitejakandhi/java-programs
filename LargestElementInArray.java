import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args){
        int arr[] = {1,2,5,9,4};
        System.out.println(" largest element : " + sort(arr));
    }
    //  using iterator
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    
}
