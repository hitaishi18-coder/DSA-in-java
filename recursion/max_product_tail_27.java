import java.util.StringTokenizer;

public class max_product_tail_27 {
    public static void main(String[] args) {
        int n = 8 ;
        // yaha se maxProduct function call kiya aur answer print kiya
        System.out.println(maxProduct(n));
    }

    // wrapper function jo recursion ko call karta hai
    static int maxProduct(int n )
    {
        int max[] = {0}; // ek single element array banaya jisme max product store hoga
                         // array isliye use kiya kyunki Java me primitive pass-by-value hota hai
                         // array reference ke through hum recursion ke andar max update kar sakte hain
        maxProduct(n,"",max); // recursion start hua
        return max[0];        // recursion ke baad final max return kiya
    }

    // recursive function jo partitions banata hai aur max update karta hai
    static void maxProduct(int n , String ans , int max [])
    {
        // BASE CASE: agar n == 0 ho jaye matlab pura todh liya hai
        if(n == 0)
        {
            // ans string ko int array me convert karte hain
            int b[] = convertToArray(ans);

            // ab product calculate karte hain
            int product = 1 ;
            for (int i = 0; i <= b.length-1; i++) {
                product = product * b[i];
            }

            // Debug ke liye (partition, array, product dekhne ke liye)
            // System.out.println(ans+"--->"+Arrays.toString(b)+"--->"+product);

            // agar current product max se bada hai to max update kar do
            if(product > max[0])
            {
                max[0] = product;
            }
        }
        else 
        {
            // agar n > 0 hai to abhi aur partition banana baaki hai
            // try karo 1 se lekar n tak ke numbers
            for (int i = 1; i <= n; i++) {
                // current i ko ans string me add karo
                // aur recursion call karo bache hue n-i ke liye
                maxProduct(n-i, ans+i+" ", max);
            }
        }
    }

    // yeh function ans string ko integer array me convert karta hai
    // Example: "2 3 3 " -> [2,3,3]
    static int[] convertToArray(String ans )
    {
        StringTokenizer st = new StringTokenizer(ans);
        int n = st.countTokens(); // kitne tokens (integers) hai ans me

        if(n == 0)
        {
            // agar empty hai to empty array return karo
            int b[] = new int[0];
            return b ;
        }
        else 
        {
            int b[] = new int[n]; // jitne tokens hai utne size ka array
            for (int i = 0; i <= n-1; i++) {
                b[i] = Integer.parseInt(st.nextToken()); // har token ko int me convert karke array me daal diya
            }
            return b;
        }
    }
}
