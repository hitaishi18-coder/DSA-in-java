import java.util.Arrays;
public class min_difference
{
    public static void main(String[] args) 
    {
        int a[] = {9,2,5,11,15,18,22,7};
        System.out.println(difference(a)); 
    }
    static int difference(int a[])
    {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0;i<=a.length-2;i++)
        {
            if(a[i+1] - a[i] < diff)
            {
                diff = a[i+1]-a[i];
            }
        }
        return diff;
    }
}
