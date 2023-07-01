public class movingZerosToLast {
    public static void moveZeroes(int[] nums) {
        int []n = new int[nums.length];
        int count = 0 , k = 0;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i] == 0){
                count++;
              }
           n[i] = nums[i];
        }
        for(int x = 0 ; x<n.length;x++){
            if(n[x]!=0){
                nums[k] = n[x];
                k++;
            }
        }
        for(int g = n.length-count ; g<n.length;g++){
            nums[g] = 0;
        }
     }
     public static void main(String[] args){
        int[] nums = {1,0,1,0};
        moveZeroes(nums);
        for(int i = 0 ; i < nums.length;i++){
            System.out.println(nums[i]);
        }
     }
}
