package src.lc.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {

    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length; //7
        // Step 1: Find the break point:
        int ind = -1; // break point
        for(int i =n-2 ; i>=0; i--){
        if(nums[i]<nums[i+1]){
            ind= i;
        }
        }
        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            reverse(nums, 0, n - 1);
            return;
        }
        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:
        for(int i = n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i]= nums[ind];
                nums[ind]= temp;
                break;
            }
        }

        reverse(nums, ind + 1, n - 1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }}