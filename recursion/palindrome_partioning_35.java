import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class palindrome_partioning_35 {
    public static void main(String[] args) {
        String s = "aab";
        // partition function call kiya aur uska output print kiya
        System.out.println(partition(s));
        // Output: [[a, a, b], [aa, b]]
    }

    // yeh function palindrome partitioning ke liye hai
    public static List<List<String>> partition(String s)
    {
        // final result list (jisme sabhi partitions store honge)
        List<List<String>> main_list = new ArrayList<>();
        
        // recursion start kiya index 0 se aur initially ans empty string diya
        cut(s, 0, "", main_list);
        
        return main_list;
    }

    // recursive function jo har position pe decide karta hai ki space lagani hai ya nahi
    static void cut(String s , int i , String ans , List<List<String>> main_list)
    {
        // BASE CASE: agar last character par pahunch gaye
        if(i == s.length()-1)
        {
            // last character add kar diya answer string ke andar
            ans = ans + s.charAt(i);
            
            // check kiya ki jo bhi partition bana hai, uske saare tokens palindrome hain ya nahi
            if(allPalindrome(ans))
            {
                // agar sab palindrome hai to ans ko list me convert karke main_list me add kar do
                List<String> ans_list = convertToList(ans);
                main_list.add(ans_list);
            }
        }
        else
        {
            // ek character pick kiya
            char ch = s.charAt(i);

            // CASE 1: is character ke baad space daal di → nayi substring start hogi
            cut(s, i+1, ans + ch + " ", main_list);

            // CASE 2: is character ke baad space nahi daali → substring continue hogi
            cut(s, i+1, ans + ch, main_list);
        }
    }

    // ans string (jisme spaces lagayi hai) ko list me convert karta hai
    // Example: "a a b" → ["a","a","b"]
    static List<String> convertToList(String ans)
    {
        List<String> al = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(ans);

        int n = st.countTokens();
        for(int i=1; i<=n; i++)
        {
            String token = st.nextToken();
            al.add(token); // har token list me add kar diya
        }
        return al;
    }

    // check karta hai ki ans string ke saare tokens palindrome hain ya nahi
    static boolean allPalindrome(String ans )
    {
        StringTokenizer st = new StringTokenizer(ans);
        int n = st.countTokens();

        boolean overall_ans = true;

        for(int i=1 ; i<=n; i++)
        {
            String tok = st.nextToken();
            // har token ke liye palindrome check kiya
            overall_ans = overall_ans && isPalindrome(tok);
        }
        return overall_ans;
    }

    // ek single string palindrome hai ya nahi, yeh check karta hai
    static boolean isPalindrome(String s)
    {
        // string ko reverse kiya
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        // agar original aur reverse same hai to palindrome hai
        return s.equals(sb.toString());
    }
}
