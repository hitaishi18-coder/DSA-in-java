public class number_partition_26 {
    public static void main(String[] args) {
        int n = 4 ;
        // partition function call kiya with n=4
        partition(n);
    }

    // wrapper function jo partitioning recursion start karta hai
    static void partition(int n )
    {
        partition(n, ""); // initially ans empty string hai
    }

    // recursive function jo n ko todta hai different partitions me
    static void partition(int n , String ans)
    {
        // BASE CASE: agar n == 0 ho gaya matlab number completely tod diya gaya
        if(n == 0 )
        {
            // jo partition bana usko print kar do
            // Example: "1 1 2 " etc.
            System.out.println(ans);
        }
        else 
        {
            // RECURSION CASE:
            // har step par 1 se lekar n tak ke numbers try karo
            for (int i = 1; i <= n ; i++) {
                // current i ko partition me add karo aur bache hue n-i ke liye recursive call
                partition(n-i , ans + i + " ");
            }
        }
    }
}
