package src.StriverSDE;

public class MaxSubArraySum_Kadene {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
    public static int maxSubArray(int[] nums) {
        int max =nums[0];
        int sum =0;
//        for(int i =0;i< nums.length;i++){
//            int sum= 0;
//            for(int j=i; j< nums.length;j++){
//                sum+=nums[j];
//                max= Math.max(sum,max);
//            }
//        }
        for(int i =0 ;i< nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
return max;
    }
}
