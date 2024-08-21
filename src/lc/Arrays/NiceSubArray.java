package src.lc.Arrays;

public class NiceSubArray {
    public static void main(String[] args) {
        int[] nums={ 1,1,2,1,1};
        int k = 3;
        numberOfSubarrays(nums,k);
    }
    public static int numberOfSubarrays(int[] nums, int k) {
    int count =0;
    int start=0 , end=k;
    while (start<=k){
        if(nums[start]%2!=0){
            count++;
        }
        else {
            count--;
        }
        start++;
    }
    return count;
    }
}
