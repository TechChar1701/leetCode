package src.StriverSDE;

import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        longestConsecutive(nums);

    }
    public static int longestConsecutive(int[] a) {
//        Arrays.sort(nums);
//        List<Integer> lst = new ArrayList<>();
//        int k = nums[0];
//        int count =1;
//        if(nums.length==0) return 0;
//        for(int i =1;i< nums.length;i++){
//            // Skip duplicates
//            if (nums[i] == nums[i - 1]) {
//                continue;
//            }
//            if(nums[i]==nums[i-1]+1){
//                count++;
//            } else {
//                lst.add(count);
//                count=1;
//            }
//        }
//        for(int i =0;i<lst.size();i++){
//            count= Math.max(count, lst.get(i));
//        }
//      return count;
//    }
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;}
}
