// two sum 

import java.util.HashSet;

public class  leetcode_1
{
    public static void main(String[] args) 
    {
        int a[] = {1,3,4,5,12,6,7,};
        int target = 12;
        System.out.println(twoSum(a,target));
      
    }
    static Boolean twoSum(int a[] , int target)
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int p:a)
        {
            hs.add(p);
        }
        for(int i=0;i<=a.length-1;)//i++//    dead code 
        
        {
            int second_number =target-a[i];
            if(hs.contains(second_number)&& a[i]!=(second_number));
            {
                return true;
            }
        }
        return false ;
    }
}
