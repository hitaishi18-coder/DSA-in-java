public class count_vowels    /// OPTIMISED 
{
    public static void main(String[] args) 
    {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowel(s,k));
    }
    public static int maxVowel(String s , int k)
    {
        int l = s.length();
        int max = 0;


        // extract first window 
        String sub = s.substring(0,0+k); // first window
        int c = countVowels(sub);
        if(c>max)
        {
            max = c ;
        }

        for(int i=k;i<=l-1;i++)
        {
            // letter which will be removed ... so remove its effect

            char old_character = s.charAt(i-k);

            if(countVowels(old_character + " ")==1) // agar old char vowel tha
            {
                c=c-1;
            }

            // now add effect of new char 

            char new_character = s.charAt(i);

            // sub = s.substring(i,i+k);

            // sout("old character " + old_charcter);

            // sout("new charcter " + new_character);

            if(countVowels(new_character+" ")==1)
            {
                c=c+1;
            }

            if(c>max)
            {
                max=c;
            }
        }
        return max;
    }

    static int countVowels(String s)
    {
        int count = 0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count ++;
            }
        }
        return count ;
    }
    
}
