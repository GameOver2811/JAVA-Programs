public class sumRecurssion {
    public static int sum(int arr[] , int i , int sum) {

        if(i == arr.length) return sum;
       
        return sum(arr, i+1, sum + arr[i]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans = sum(arr , 0 , 0);
        System.out.println(ans);
    }
}
