// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left
// of the index is equal to the sum of all the numbers strictly to the index's right.

//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.
public class leetcode_724 
{
    public static void main(String[] args) 
    {
        int nums[] = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    
    }
    public static int pivotIndex(int[] nums)
    {
        int [] prefix = new int[nums.length];  // prefix array is mean to store the sum of 
        // elements to the left of each index 
        int sum = nums[0];
        prefix[0] = 0; // correctly initialize the prefix sum of index 0 

        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i]; // compute total sum 
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(prefix[i]==sum-nums[i]-prefix[i])
            {
                return i;
            }
        }
        return -1;  // not found 

    }
}
