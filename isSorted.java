public class isSorted {
    public static boolean iisSorted(int[] arr , int size){

        if(size <= 1) return true;

        if(arr[size] < arr[size-1]) return false;
        
        return iisSorted(arr, size-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,13,4,5};
        boolean ans = iisSorted(arr , arr.length-1);
        System.out.println(ans);
    }
}
