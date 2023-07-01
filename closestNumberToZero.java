public class closestNumberToZero {
    public static int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length ; i++){
            if(0 > nums[i])
            ans = Math.min(ans,(0-nums[i]));
            else
            ans = Math.min(ans,(nums[i]-0));
        }
        //System.out.println();
        if(ans < 0)
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == -ans) return -ans;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {-100,-100};
        int and = findClosestNumber(arr);
        System.out.println(and);
    }
}
