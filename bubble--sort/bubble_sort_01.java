import java.util.Arrays;

public class bubble_sort_01
{
    public static void main(String[] args) 
    {
        int a[] = { 3,9,8,7,1,10,2,4,5,6,16,23,45,11,12,10,12,78,90,43,54,21 };

        System.out.println("original");

        System.out.println(Arrays.toString(a));

        bubbleSort(a);

        System.out.println("after sorting");

        System.out.println(Arrays.toString(a));
    }

    static void bubbleSort(int a[])
    {
        int i , j , t ;

        int N = a.length;

        for ( i = 0; i < N-2; i++)    // passes 
        {
            for ( j = 0; j < N-2-i; j++)  //compare nd swap 
            {
                if(a[j] > a[j+1])  
                {
                    t      = a[j];
                    a[j]   = a[j+1];
                    a[j+1] = t ;
                } 
            }   
        }
    }

}