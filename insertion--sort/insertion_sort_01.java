import java.util.*;

public class insertion_sort_01
{
    public static void main(String[] args) 
    {
        int a[] = { 9,8,7,4,5,6,3,2,10,1 };
        
        System.out.println("Initially ...");
        System.out.println(Arrays.toString(a));
        
        insertionSort(a);

        System.out.println("After Sorting ...");
        System.out.println(Arrays.toString(a));
    }
    
    static void insertionSort(int a[])
    {
        int i, j, l = a.length, num;
        
        for(i=1; i<=l-1; i++)   // Har element ko pick karke sorted part me insert karna hai
        {
            // ith element pick karo
            num = a[i];
            System.out.println("\nPick num: "+num);
            
            // Shift karte jao jab tak num se bada element mile
            for(j=i-1; j>=0 ;j--)
            {
                if( a[j] > num )
                {
                    // Agar num se bada hai toh ek step right shift karo
                    a[j+1] = a[j];
                }
                else
                {
                    // Agar chhota number mil gaya toh wahi insertion point hai
                    a[j+1] = num;
                    break;
                }
            }
            
            // Agar loop pura chal gaya (num sabse chhota nikla)
            if(j == -1)
            {
                a[0] = num;
            }
            
            // Har step ka array dikhate hain
            System.out.println("Step " + i + ": " + Arrays.toString(a));
        }
    }
}
