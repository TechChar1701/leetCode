package src.lc.Sorting;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1,  3, 3, 4, 4, 2,8, 8};
        singleNonDuplicate(nums);
    }

    public static int singleNonDuplicate(int[] nums) {
        //(even, odd) -> element is in right half , (odd, even) -> element is in left half
        int length = nums.length;
        if (length==1) return nums[0];
        int low = 1;
        int high = length - 2;
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[length-1]!=nums[length-2]) return nums[length-1];
        while (low <= high) {
        int mid = (low+high)/2;
        //check if mid is the single element
        if(nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid+1]) return nums[mid];
        //check if we are in left
        if((mid%2==1) && nums[mid]== nums[mid-1] || (mid%2==0) && nums[mid]== nums[mid+1]){
            low = mid+1;
        }
        else{
            high= mid-1;
        }
    }
        return -1;}
}