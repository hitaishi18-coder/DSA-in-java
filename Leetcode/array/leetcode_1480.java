//Given an array nums. We define a running sum of an array as 
//runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

import java.util.Arrays;

public class leetcode_1480 
{
    public static void main(String[] args) 
    {
        int nums[] = {1,2,3,4};
        int b[] = sumOfArray(nums);  // b aray ko store krne k liye 
        System.out.println(Arrays.toString(b));  // print krne k liye
    }  
    public static int[] sumOfArray(int[] nums)
    {
        int b[] = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
        sum+=nums[i];

        b[i] = sum;

        }
        return b;
    }
}


// O(n) 