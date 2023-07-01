import java.util.*;

public class linearSearchRecurssion {
    public static boolean contain(int[] arr , int key , int start){

        if(start == arr.length) return false;

        if(arr[start] == key) return true;
        
        return contain(arr, key, start+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int key = 5;
        boolean ans = contain(arr , key , 0);
        System.out.println(ans);
    }
}
