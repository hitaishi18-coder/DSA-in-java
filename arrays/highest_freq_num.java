import java.util.*;

public class highest_freq_num
{
    public static void main(String[] args) 
    {
        int a[] = { 1,1,1,2,3,4,4,5,5,6,6,6,6,7 };
        System.out.println(highestFrequency(a));
    }

    static int highestFrequency(int a[])
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<=a.length-1; i++)
        {
            int num = a[i];
            //try to get old value if val is missing assume as 0 

            int val = hm.getOrDefault(num, 0);  
             //use to get the value of key if key is present else return default value
             // is used to retrieve the current count or initialize it to 0 . 
             // the count is incremented nd sorted back in the hashmap 

            val++;  
            hm.put(num, val); //putting the key and value in hashmap , store the updated count 

        }
        System.out.println(hm);

        //now get the keys with max value
        Set<Integer> keys = hm.keySet(); // get all keys 
        int large_value = 0; 
        int large_num = 0; 
        
        for(int p:keys)
        {
            int val = hm.get(p);
            if(val > large_value)
           {
             large_value = val;
             large_num = p;
           }
        }
            return large_num;
    }

}


// leetcode 442