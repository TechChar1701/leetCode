package src.lc.Arrays;

import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        frequencySort(nums);
    }
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< nums.length-1;i++){
            int key= nums[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else {
                map.put(key, map.get(key)+1);
            }
        }

        return nums;
    }

}
