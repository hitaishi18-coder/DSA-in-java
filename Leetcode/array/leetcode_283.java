import java.util.Arrays;

public class leetcode_283 
{
    public static void main(String[] args) 
    {
        int nums[] = {1, 4, 0, 7, 8};
        moveZeroes(nums);  // Call the static moveZeroes method
        System.out.println(Arrays.toString(nums));  // Print the modified array
    }

    // Make moveZeroes static to be able to call it from main
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
        }
    }

    // Swap method is static, as we are calling it from the static moveZeroes method
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
