
import java.util.Scanner;

public class isArraySorted {
    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){
           return true;
        }
        if (arr[i]<arr[i+1]){
            return isSorted(arr, i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,99,444,544};
        int i =0 ;
        boolean num = isSorted(arr, i);
        if (num == true){
            System.out.println("Given Array is Sorted");
        }else{
            System.out.println("Given Array is not Sorted");
        }
        
    }
}
