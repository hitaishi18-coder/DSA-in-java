//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.

import java.util.Arrays;

public class leetcode_169
{
    public static void main(String[] args) 
    {
        int nums[] = {3,2,3};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println(majorityElement(nums));
    }
     public static int  majorityElement(int[] nums)
    {
        Arrays.sort(nums); // sort array
        return nums[nums.length/2];   // the majority element is always at middle indexx

    }
}



// o(n log n)