import java.util.ArrayList;
import java.util.Arrays;

public class delete_duplicates 
{
    public static void main(String[] args) 
    {
        int a[] = {2,3,4,4,4,5,6,6,7,7,7,8,8,15,15,20,20,21,22,22};
        int b[] = deleteDuplicates(a);
        System.out.println(Arrays.toString(b));
    }
    static int[] deleteDuplicates(int a[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<=a.length-1;i++)
        {
            al.add(a[i]);
        }
        for(int i=0;i<= al.size()-2; i++)
        {
            if (al.get(i) == al.get(i+1))
            {
                al.remove(i);
                i--;

            }
        }
        int b[] = new int[al.size()];
        // copy elements from list to array .. bcoz we return ans in array 

        for(int i=0;i<=al.size()-1;i++){
            b[i] = al.get(i);
        }
        return b; 
    }
}
