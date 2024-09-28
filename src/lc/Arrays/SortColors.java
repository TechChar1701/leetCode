package src.lc.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums= {0,2,1,2,1};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int p1=0;
        int p2= nums.length;
        int runner=0;
        while(runner<p2){
            if(nums[runner]==0){
                swap(p1,runner,nums);
                p1++; runner++;
            } else if (nums[runner]==2) {
                swap(p2,runner,nums);
                p2--;
            }
            else {
                runner++;
            }
        }

}
public static void swap( int i, int j , int[] nums){
    int x = nums[i];
    nums[i]= nums[j];
    nums[j]= x;
    }
}
