// import java.util.*;

public class multiple_missing 
{
    public static void main(String[] args) 
    {
        int a [] = {1,3,4,6,9,10};
        multipleMissing(a,10);
    }
    static void multipleMissing(int a[] , int N)
    {
        int freq[] = new int [N+1];    // actual is bdha aaray bnana hai agar 10 hai toh freq array 11 
        // bcoz Array 0 se shuru hoga 

        
        // pick element and set 1 in corresponding freq array 
        for(int i=0; i<=a.length-1;i++)
        {
            int num = a[i];
            freq[num] = 1;
        }
        // now check which element have 0 ie missing 
        for(int i=1;i<=freq.length-1;i++)
       {
        if (freq[i]==0)
        {
            System.out.println("missing " + i);
        }
       } 

    }
}

// tick