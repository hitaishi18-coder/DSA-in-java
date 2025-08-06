// There are n kids with candies. You are given an integer array candies, where each candies[i] 
//represents the number of candies the ith kid has, and an integer extraCandies,
// denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;


public class leetcode_1431 
{
    public static void main(String[] args) 
    {
        int candies[] = {2,3,5,1,3};
        int  extra_Candies = 3;
        System.out.println(kidsMaxCandies(candies , extra_Candies));
    }
   static List<Boolean> kidsMaxCandies(int candies[], int extra_Candies)
    {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
      

        // find the max candies any kid currently has 
        for(int candy:candies)
        {
            maxCandies = Math.max(maxCandies,candy); // maxcandies stores higher no of candies  ... 5

        }
        
        // check for each kid 

        for(int i=0;i<=candies.length-1;i++)
        {
         

          if(candies[i]+extra_Candies>=maxCandies)
          {
            result.add(true) ;
          }
          else {
            result.add(false);
          }
        }
        return result;

    
}
}
