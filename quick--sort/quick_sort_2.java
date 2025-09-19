import java.util.Arrays;

public class quick_sort_2 {
    public static void main(String[] args) {
        int a[] = {10, 7, 2, 3, 6, 1, 4, 8, 9, 5};
        int L = 0;
        int U = a.length - 1;

        System.out.println("Before sorting: " + Arrays.toString(a));
        divide(a, L, U);  // quick sort start kar rahe hai
        System.out.println("After sorting:  " + Arrays.toString(a));
    }

    // ye function array ko recursively divide karta hai
    static void divide(int a[], int L, int U) {
        if (L < U) {
            // pivot ko sahi jagah rakhte hai aur uska position milta hai
            int position = partition(a, L, U);

            // pivot ke left side ka part sort karte hai
            divide(a, L, position - 1);

            // pivot ke right side ka part sort karte hai
            divide(a, position + 1, U);
        }
    }

    // partition function pivot ke around array ko divide karta hai
    static int partition(int a[], int L, int U) {
        int i = L - 1;       // i track karta hai smaller elements ka index
        int PIVOT = a[U];    // pivot ko humesha last element lete hai

        // L se lekar U-1 tak iterate karte hai
        for (int j = L; j < U; j++) {
            // agar element pivot se chhota ya equal hai to swap karte hai
            if (a[j] <= PIVOT) {
                i++;
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }

        // ab pivot ko uski correct position par rakhte hai (i+1 pe)
        int t = a[i + 1];
        a[i + 1] = a[U];
        a[U] = t;

        // pivot ki correct position return karte hai
        return i + 1;
    }
}
