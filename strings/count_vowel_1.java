public class count_vowel_1 
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
         for(int i=0;i<=l-k;i++)
         {
            String sub = s.substring(i, i+k);
            int c = countVowels(sub);
            if(c>max)
            {
                max = c;
            }
         }
         return max ;
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


