public class max_difference 
{
    public static void main(String[] args) 
    {

        int a[] = {7,12,8,5,2,9,3,15,30 };
        System.out.println(maxDifference(a));
    }
    static int maxDifference(int a[])
    {
        int small = a[0];
        //find smallest 
        for(int i=1;i<=a.length-1;i++)
        {
            if (a[i]<small)
            {
                small=a[i];
            }
        }
        int large = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        return large-small;
    }
}

