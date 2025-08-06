public class palindrome1

{
    public static void main(String[] args) 
    {
        String s = "malayalam";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();      // palindrome means to reverse a string  and output is same 
        // so we use reverese function 
        String rev = sb.toString();  // return ans in string .
        if (s.equals(rev))
        {
            System.out.println("is palindrome..");
        } else 
        {
            System.out.println("not palindrome..");
        }

    }
}
