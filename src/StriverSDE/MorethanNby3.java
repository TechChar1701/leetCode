package src.StriverSDE;

import java.util.*;

public class MorethanNby3 {
    public static void main(String[] args) {
        int[] nums ={1,2,1};
        majorityElement(nums);
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> lst = new ArrayList<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        int n = nums.length;
//        for (int i =0; i<n;i++){
//            int m = nums[i];
//            if(!map.containsKey(m)){
//                map.put(m,1);
//            }
//            else {
//                map.put(m,map.get(m)+1);
//            }
//        }
//        for (int key : map.keySet()){
//
//            if(map.get(key)>n/3){
//                lst.add(key);
//            }
//        }
        int el =0;
        int cnt =0;
        for(int i =0;i<nums.length;i++){
            if(cnt==0){
                el = nums[i];
            }
            else if(nums[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return lst;
    }
}
