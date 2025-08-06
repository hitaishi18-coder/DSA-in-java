



//Given an integer array nums, return an array answer such that answer[i] is equal to the product
// of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

import java.util.Arrays;

public class leetcode_238 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }
        
 public static int[] productExceptSelf(int[] a)
{
    int n = a.length;
    int[] result = new int[n];

    // start result of aarray with 1

    result[0]=1;

    // left product 
    for(int i=1;i<n;i++)  // start from 1 bcoz result[0] = 1;

    {
        result[i] =  result[i-1] * a[i-1];
    }


    // right product 
    int right =1 ;
    for(int i=n-2;i>=0;i--)
    {
        right*=a[i+1];
        result[i] *= right;
    }
    return result;
}

}
