public class longest_palindrome 
{
    public static void main(String[] args) 
    {
        String s =  "popmadamracecar";
        System.out.println(longestPalindrome(s));
    }
    static int longestPalindrome(String s)
    {
        int l=s.length();
        int max = 1; // initialise max palindrome length 
        for(int i=2;i<=l;i++)
        {
            //System.out.println("size " + i); 
            int answer = substringksize(s,i);   // check if palindrome of size i exist
           // System.out.println("ans" + answer);
            if(answer>max)
            {
                max = answer ;  // update the max palindrome length 
            }
        }
        return max ;   // return length of longest palindrome
    }

    static int substringksize(String s , int k ) 
    {
        int l = s.length();
        int flag = 0 ;
        for(int i=0;i<=l-k;i++)
        {
            String sub = s.substring(i, i+k); // extract substring 
            if(isPalindrome(sub))
            {
                flag = 1 ;
                break;
            }
        }

        if(flag == 1)
        {
            return k;
        }
        else 
        {
            return -1;
        }
    }

    static boolean isPalindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
    
}

