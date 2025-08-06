
public class min_chars_to_make_palindrome 
{
    public static void main(String[] args) 
    {
        String s = "ABBC";
        
        System.out.println(minChars(s));
    }
    
    static int minChars(String s)
    {
        if(isPalindrome(s))
        {
            return 0;
        }
        else
        {
            String orig = s;
            int l=s.length();
            int ans  = 0;
            
            for(int i=1; i<=l; i++)
            {
                String sub = orig.substring(0,i);
                String rev = new StringBuffer(sub).reverse().toString();
                
                if(isPalindrome(s+rev))
                {
                    ans = rev.length();
                    break;
                }
            }
            
            return ans;
        }
    }
    
    
    static boolean isPalindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}