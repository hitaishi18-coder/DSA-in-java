import java.util.Arrays;

public class bubble_sort_names_02 {
    public static void main(String[] args) {
        String a[] =  { "inaayat", "tisnoor", "yashika", "jiya", "akansha", "vansh", "ekam", "aditya", "ankush", "atul", "shubham", "harsh", "amrinder" };
        
        System.out.println("original");

        System.out.println(Arrays.toString(a));

        bubbleSort(a);

        System.out.println("after sorting");
        
        System.out.println(Arrays.toString(a));
    }

    static void bubbleSort(String a[])
    {
        int i , j ;
        String t ; 
        int N = a.length;

        for ( i = 0; i < N-2; i++) {           // passes
            for ( j = 0; j < N-2-i; j++) {     // compare nd swap 
                if(a[j].compareTo(a[j+1]) > 0) // asc , desc 
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t ;
                }
            }
        }
    }
}
