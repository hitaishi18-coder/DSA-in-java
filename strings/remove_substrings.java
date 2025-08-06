public class remove_substrings
{
    public static void main(String[] args) 
    {
        String s = "ABCDEF";
        allsubstring(s);
    }
    static void allsubstring(String s)
    {
        // this method generates substring of all possible length ...
        // from 0 to s.lengthn 
        int l = s.length();
        for(int i=0;i<=l;i++)
        {
            System.out.println("size " + i);

            // for each substring size i .. it prints size i and call 
            // substring(s,i)

            SubStringksize(s,i);
            // print substing of length i from the string s 

            System.out.println("---------");
        }
    }
    static void SubStringksize(String s , int k )
    {
    
        int l = s.length();
        for(int i=0;i<= l-k;i++)
        {
            String sub = s.substring(i, i+k);
            System.out.println(sub);
        }
    }
}



