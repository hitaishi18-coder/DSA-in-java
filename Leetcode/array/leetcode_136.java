public class leetcode_136 

// single number 

{
    public static void main(String[] args) 
    {
        int a[] = {4,1,2,1,2};;
        System.out.println(singleNumber(a));
    }
    public static int singleNumber(int a[])
    {
        int value = 0;
        for(int i=0;i<a.length;i++)
        {
            value = value^a[i];
        }
        return value;

    }
}

