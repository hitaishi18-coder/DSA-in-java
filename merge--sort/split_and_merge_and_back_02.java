import java.util.Arrays;

public class split_and_merge_and_back_02 {
    public static void main(String[] args) {
        int a[] = {5,7,2,4};

        System.out.println("---original---");
        System.out.println(Arrays.toString(a));

        splitAndMergeBack(a,0,3);

        System.out.println("---updated Array---");
        System.out.println(Arrays.toString(a));
    }

    static void splitAndMergeBack(int a[] , int L , int U)
    {
        // split
        int mid = (L+U)/2;

        int t1[] = new int[mid-L+1];
        int t2[] = new int[U-mid];

        // copy elements into t1
        for (int i = 0; i < t1.length; i++) {
            t1[i] = a[i+L];
        }

        // copy elements into t2
        for (int j = 0; j < t2.length; j++) {
            t2[j] = a[j+(mid+1)];
        }

        System.out.println("Left Part: " + Arrays.toString(t1));
        System.out.println("Right Part: " + Arrays.toString(t2));

        // Merge Back
        int m = t1.length;
        int n = t2.length;

        int i=0, j=0, k=L;

        while(i<m && j<n) {
            if(t1[i] < t2[j]) {
                a[k] = t1[i];
                i++;
            } else {
                a[k] = t2[j];
                j++;
            }
            k++;
        }

        // copy remaining of t1
        while(i<m) {
            a[k] = t1[i];
            i++;
            k++;
        }

        // copy remaining of t2
        while(j<n) {
            a[k] = t2[j];
            j++;
            k++;
        }
    }
}
