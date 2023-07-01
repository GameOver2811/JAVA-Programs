import java.util.Scanner;

public class binarysearchRecurssion {
    public static boolean search(int arr[] , int key , int start , int end){
        if(start > end) return false;
        int mid = start + (end - start)/2;
        if(arr[mid] == key) return true;
        boolean ans;
        if(arr[mid] < key){
            start = mid + 1;
             ans = search(arr, key, start, end);
        }
        else{
            end = mid - 1;
             ans = search(arr, key, start, end);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = sc.nextInt();
        sc.close();
        boolean ans = search(arr , key ,0 , arr.length-1);
        System.out.println(ans);
    }
}
