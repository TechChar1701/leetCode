package src.lc.Arrays;

import java.util.Arrays;

public class PositiveNegativeHighest {
    public static void main(String[] args) {
        int[] nums= {-1,2,-3,3};
        findMaxK(nums);
    }
    public static int findMaxK(int[] nums) {
        int num= 0;
        Arrays.sort(nums);
        for(int i =0; i< nums.length; i++){
            if(nums[i]<0){
             num = nums[i];}
            for(int j =i+1; j<nums.length; j++){
                int numsj = -nums[j];
                if(num ==numsj){
                    return nums[i];
                }
                else{
                    num =nums[i];
                }
            }
        }
        return -1;
    }
}
