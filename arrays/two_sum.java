import java.util.HashSet;

public class two_sum 
{
    public static void main(String[] args) 
    {
        int a[] = {7,1,2,8,9,10,5};
        int target = 12;
        System.out.println(checkTwoSum(a,target));
    }
    static Boolean checkTwoSum(int a[], int target)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int p:a)
        {
            hs.add(p);
        }
        for(int i=0; i<=a.length-1;)
        {
            int second_number = target-a[i];
            if (hs.contains(second_number)&&a[i]!=second_number);
            {
                return true ;
            }
        }
        return false;
    }
}   
