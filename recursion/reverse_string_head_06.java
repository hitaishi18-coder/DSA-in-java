public class reverse_string_head_06 {
    public static void main(String[] args) {
        String s = "ABCDEF";
        System.out.println(reverse(s, s.length()-1));
    }
    static String reverse(String s , int i)
    {
        if(i == -1 )
        {
            return "";
        }
        else 
        {
            char ch = s.charAt(i);
            return ch + " " + reverse(s, i-1);
        }
    }
}
