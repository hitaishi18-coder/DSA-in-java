public class check_anagram_36 {
    public static void main(String[] args) {
        String s = "ABC";

        // Start permutation generation
        permutation(s, "");
    }

    // Recursive function to generate all permutations of string s
    static void permutation(String s , String ans)
    {
        //  Base Case: jab string khatam ho gayi (no chars left to choose)
        if(s.equals(""))
        {
            // jo bhi ab tak build hua hai (ans) ek complete permutation hai
            System.out.println(ans);
        }
        else
        {
            // Har character ko fix karo ek baar starting position pe
            // aur baaki string ke permutations generate karo
            for (int i = 0; i <= s.length()-1; i++) {
                
                // Step 1: ith character choose karo
                char ch = s.charAt(i);

                // Step 2: us character ke bina baaki string banao
                // Example: s = "ABC", i=1 → remaining = "AC"
                String remaining = s.substring(0,i) + s.substring(i+1);

                // Step 3: recursion call with remaining chars
                // aur fixed char ko ans me add karte jao
                permutation(remaining, ans+ch);
            }        
        }
    }
}
