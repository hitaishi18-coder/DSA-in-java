public class cut_string_33 {
    public static void main(String[] args) {
        String s = "ABCD";
        cut(s);
    }
    static void cut(String s )
    {
        cut(s,0,"");
    }
    static void cut(String s , int i, String ans)
    {
        if(i == s.length()-1)
        {
            ans = ans + s.charAt(i);
            System.out.println(ans);
        }
        else 
        {
            // pick a char 
            char ch = s.charAt(i);

            // append as char + " "
            cut(s, i+1, ans+ch+ ".");

            // or char + no space 
            cut(s, i+1, ans+ch);
        }
    }
}
