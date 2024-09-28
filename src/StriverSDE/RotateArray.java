package src.StriverSDE;

public class RotateArray {
    public static void main(String[] args) {
    int[] nums= {1,2,3,4,5,6,7};
    int k =3;
    rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        k = k % n; // Handle cases where k is larger than the array length

        // Copy the elements that will be moved to the front
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        // Copy the remaining elements
        for (int i = k; i < n; i++) {
            arr[i] = nums[i - k];
        }

        // Copy back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }}
}
