public class subset_of_string_15 {
    public static void main(String[] args) {
        String s = "ABCDEF";
        subset(s , 0 , " ");
    }
    static void subset(String s , int i , String ans )
    {
        if(i == s.length())
        {
            System.out.println(ans);
        }
        else 
        {
            char ch = s.charAt(i);

            // include 
            subset(s, i+1, ans+ch);

            // dont include 
            subset(s, i+1, ans);
        }
    }
}
