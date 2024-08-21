package src.StriverSDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        longestConsecutive(nums);

    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        int k = nums[0];
        int count =1;
        if(nums.length==0) return 0;
        for(int i =1;i< nums.length;i++){
            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count++;
            } else {
                lst.add(count);
                count=1;
            }
        }
        for(int i =0;i<lst.size();i++){
            count= Math.max(count, lst.get(i));
        }
      return count;
    }
}
