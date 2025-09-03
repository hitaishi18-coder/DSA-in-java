import java.util.*;

public class split_into_primes_34 {
    public static void main(String[] args) {
        String s = "11373"; // input number string (yahan ek single string me number diya hai)
        split(s); // function call kiya jo splitting aur prime check karega
    }

    // wrapper function jo recursion ko start karta hai
    static void split(String s )
    {
        split(s,0,""); // recursion ko index 0 se aur initially empty answer ke saath start kiya
    }

    // recursive function jo har position pe decide karega ki space lagana hai ya nahi
    static void split(String s , int i , String ans)
    {
        // base case: agar hum string ke last character pe aa gaye
        if(i == s.length()-1)
        {
            ans = ans + s.charAt(i); // last character add kar diya ans me

            // agar ans ke saare tokens (space-separated numbers) prime hain
            if(allPrimes(ans))
            {
                System.out.println(ans); // valid splitting print kar do
            }
        }
        else 
        {
            // ek character uthaya
            char ch = s.charAt(i);

            // case 1: is character ke baad space daalo (naya number shuru hoga)
            split(s,i+1, ans+ch+" ");

            // case 2: is character ke baad space mat daalo (same number continue hoga)
            split(s,i+1,ans+ch);
        }
    }

    // yeh function check karega ki ans string ke saare space-separated numbers prime hain ya nahi
    static boolean allPrimes(String ans)
    {
        boolean overall_ans = true;
        StringTokenizer st = new StringTokenizer(ans); // string ko space ke hisaab se tod diya
        int n = st.countTokens();

        for (int i = 0; i < n; i++) {
            String token = st.nextToken(); // ek-ek number nikala
            int num = Integer.parseInt(token); // string → integer
            overall_ans = overall_ans && isPrime(num); // har number prime hai ya nahi check kiya
        }

        return overall_ans;
    }

    // ek number prime hai ya nahi check karne ka function
    static boolean isPrime(int n)
    {
        if(n == 1) // 1 prime nahi hota
        {
            return false ;
        }
        else 
        {
            // number ke factors check kiye 2 se sqrt(n) tak
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) // agar divide ho gaya to prime nahi
                {
                    return false ;
                }
            }
        }
        return true ; // agar kahin divide nahi hua to prime hai
    }
}
