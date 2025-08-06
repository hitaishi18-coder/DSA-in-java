public class sliding_window 
{
    public static void main(String[] args) 
    {
        String s = "ABCDEFGHIJ";
        int k = 3;
        allSubString(s,k);
    }
    static void allSubString(String s , int k)
    {
        int l=s.length();
        for(int i=0;i<=l-k;i++)
        {
            String sub = s.substring(i,i+k);
            System.out.println(sub);
        }
    }
}
