package src.lc.Sorting;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target = 5;
        search(nums,target);
    }
    public static int search(int[] nums, int target) {
    int high = nums.length-1;
    int low = 0;
    while(low<=high){
        int mid= (low+high)/2;
        if(nums[mid] == target){
            return mid;
        }

        if(target<=nums[mid] && nums[high]<target ){

            high= mid-1;
        }
        else {
          low= mid+1;
        }
    }

        return -1;
    }
}

