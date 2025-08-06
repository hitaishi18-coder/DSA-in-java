import java.util.ArrayList;
import java.util.List;

public class multiple_missing2
{
    public static void main(String[] args) 
    {
        int a[] = {1,3,4,6,9,10};
        System.out.println(multipleMissing(a,10));
    }
    static List<Integer>multipleMissing(int a[] , int N)    // list
    {
        int freq[] = new int[N+1];

        // pick element and set 1 in corresponding freq array 

        for(int i=0; i<=a.length-1;i++)
        {
            int num=a[i];
            freq[num]=1;
        }
        List<Integer>al= new ArrayList<>();    // list return hogi . 
        // now check which elementb have 0 is missing 
        for(int i=1; i<=freq.length-1;i++)
        {
            if(freq[i]==0)
            {
                System.out.println("missing"+ i );
                al.add(i);

            }
        }
        return al;
    }
}


// tick



