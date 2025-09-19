import java.util.Arrays;

public class selection_sort_01 {

    public static void main(String[] args) {
        int a[] = {7, 3, 2, 1, 10, 9, 8, 6, 5, 4};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(a)); // array ko print kar rahe hain sorting se pehle

        selectionSort(a); // function call

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(a)); // array ko print kar rahe hain sorting ke baad
    }

    static void selectionSort(int a[]) {
        int N = a.length; // array ka size store kar liya

        // outer loop: har ek element ke liye
        for (int i = 0; i <= N - 2; i++) {
            int small = a[i];    // maan lo current element sabse chhota hai
            int position = i;    // uski position bhi store kar li

            // inner loop: baaki bache elements me actual chhota number dhoondo
            for (int j = i + 1; j <= N-1; j++) {
                if (a[j] < small) {
                    small = a[j];     // agar chhota element mil gaya to usse update kar do
                    position = j;     // aur uski position bhi
                }
            }

            // ab smallest element ko swap kar do current element ke sath
            int t = a[i];
            a[i] = a[position];
            a[position] = t;
        }
    }
}
