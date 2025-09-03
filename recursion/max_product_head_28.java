import java.util.*;

public class max_product_head_28
{
    public static void main(String[] args) 
    {
        int n = 8;
        
        // yaha se maxProduct function call ho raha hai
        // aur jo bhi maximum product partition banega uska result print hoga
        System.out.println(maxProduct(n));
    }
    
    // yeh wrapper function hai jo actual recursion ko call karega
    static int maxProduct(int n)
    {
        // initially ans empty string diya gaya hai
        // ans string me hum numbers ko as partition store karte jayenge
        return maxProduct(n, "");
    }
    
    // yeh recursive function hai jo n ko chhote parts me todta hai
    // ans string me ab tak ke parts store hote hain
    static int maxProduct(int n, String ans)
    {
        // BASE CASE: jab n == 0 ho jaye matlab humne pura number tod diya
        if(n==0)
        {
            // ab ans string ko int array me convert karte hain
            // jaise "3 3 2 " --> [3,3,2]
            int b[] = convertToIntArray(ans);
            
            int prod = 1; // product calculate karne ke liye
            
            // array ke saare elements multiply kar rahe hain
            for(int i=0; i<=b.length-1; i++)
            {
                prod = prod * b[i];
            }
            
            // Debugging ke liye line (har partition aur uska product dekhne ke liye)
            // System.out.println(ans+"--> "+Arrays.toString(b) +"--> "+prod);
            
            // jo product mila usko return kar diya
            return prod;
        }
        else
        {
            // agar n > 0 hai to hume aur todna hai
            int overall_max = 0; // ab tak ka maximum product store karega
            
            // try karte hain 1 se lekar n tak har possible partition
            for(int i=1; i<=n; i++)
            {
                // current partition me i add karte hain
                // aur n-i remaining part ke liye recursion call hota hai
                // example: n=5, i=2 => ans = "2 " aur recursion call for n=3
                int temp_ans = maxProduct(n-i, ans+i+" ");
                
                // ab check karte hain ki jo product mila wo maximum hai ya nahi
                if(temp_ans > overall_max)
                {
                    overall_max = temp_ans; // update maximum
                }
            }
            
            // loop ke baad overall maximum return kar do
            return overall_max;
        }
    }
    
    // yeh function ans string ko integer array me convert karta hai
    // Example: "2 3 3 " -> [2, 3, 3]
    static int[] convertToIntArray(String ans)
    {
        StringTokenizer st = new StringTokenizer(ans); // space ke basis par tod diya
        
        int n = st.countTokens(); // kitne tokens (integers) hai
        
        if(n==0)
        {
            // agar ans string empty hai to empty array return karo
            int b[] = new int[0];
            return b;
        }
        else
        {
            int b[] = new int[n]; // array banaya jitne tokens hain utna size
            
            // saare tokens ko integer me convert karke array me daala
            for(int i=0; i<=n-1; i++)
            {
                b[i] = Integer.parseInt(st.nextToken());
            }
            
            return b; // array return kiya
        }
    }
}
