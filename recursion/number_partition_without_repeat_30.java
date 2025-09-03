public class number_partition_without_repeat_30 {
    public static void main(String[] args) {
        int n = 4 ;
        // partition function call kiya:
        // n=4 (total todhna hai), max=4 (abhi tak max number allowed 4 hai), ans=""
        partition(n , n , "");
    }

    // recursive function jo partitions generate karta hai
    // n  = abhi kitna bacha hai todhne ke liye
    // max = abhi tak allowed maximum number (order control ke liye)
    // ans = ab tak banaya gaya partition
    static void partition(int n , int max , String ans)
    {
        // BASE CASE: agar n pura 0 ho gaya → valid partition ban gaya
        if(n == 0)
        {
            System.out.println(ans);
        }
        else 
        {
            // har step par try karo 1 se lekar n tak numbers
            for(int i = 1 ; i<=n ; i++)
            {
                // condition: i <= max
                // matlab partition hamesha non-increasing order me banega
                // isse duplicates jaise "1 3" aur "3 1" avoid ho jate hain
                if (i <= max) {
                    // recursive call: n-i bacha, aur ab max=i (taaki agli baar usse bada number na aaye)
                    partition(n-i, i, ans + i + " ");
                }
            }
        }
    }
}
