public class palindrom2 
{
    public static void main(String[] args) 
    {
        String s = "malayalam";
        System.out.println(ispalindrome(s));
    }
    static Boolean ispalindrome (String s)
    {
        return(new StringBuffer(s).reverse().toString().equals(s));
    }
    
}