public class monotonic
// monotonic means ascending and descending both 

{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(monotonicArray(a));
    }
    static Boolean monotonicArray(int a[])
    {
        if (isAscending(a) || isDescending(a))
        {
            return true;
        }
        else {
            return false; 
        }
    }
    static Boolean isAscending(int a[])
    {
        Boolean flag = true;
        for(int i=0;i<=a.length-2;i++)
        {
            if (a[i] <= a[i+1])
            {
                // do nothing 
            }
            else 
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static Boolean isDescending(int a[])
    {
        Boolean flag = true;
        for(int i=0; i<=a.length-2;i++)
        {
            if(a[i]<=a[i+1])
            {
                // do nothing 
            }
            else 
            {
                flag = false;
            }
        }
        return flag;
    }
}
