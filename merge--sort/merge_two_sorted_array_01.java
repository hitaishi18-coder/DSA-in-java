import java.util.Arrays;

public class merge_two_sorted_array_01
{
    public static void main(String[] args) 
    {
        int a[] = {2,4};
        int b[] = {1,3};

        int c[] = mergeSorted(a,b);

        System.out.println(Arrays.toString(c));
    }

    static int [] mergeSorted(int a[] , int b[])
    {
        int m = a.length;
        int n = b.length;

        int c[] = new int[m+n];

        int i = 0, j = 0, k = 0;

        // Compare elements of both arrays
        while(i < m && j < n) {
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of a[]
        while(i < m) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b[]
        while(j < n) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
