import java.util.Arrays;

public class count_anagram 
{
    public static void main(String[] args) 
    {
         String s = "ABCDEFHBCAEELLCABOOWORLDABCABCABCABACAB" ;
         String w = "ABC";
         System.out.println(countAnagrams(s,w));       
    }


   
    static int countAnagrams(String s , String w )
    {
        int count=0;
        int i,l=s.length(),k=w.length();
        for(i=0;i<=l-k;i++)
        {
            String sub = s.substring(i, i+k);
            if(isAnagram(sub,w))
            {
                 count++;
            }
        }
      return count ;
    }



    static boolean isAnagram(String s,String w)
    {
        char a[] = s.toCharArray();
        char b[] = w.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }

 }
    
