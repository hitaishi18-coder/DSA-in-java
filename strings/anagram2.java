import java.util.HashMap;

public class anagram2 
{
    public static void main(String[] args) 
    {
        String s1 = "ABC";
        String s2 = "BCAA";
        System.out.println(checkAnagram(s1,s2));
    }
    static Boolean checkAnagram(String s1 , String s2 )
    {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i=0;i<=s1.length()-1;i++)
        {
            char ch = s1.charAt(i);
            int value = hm1.getOrDefault(ch,0);
            value++;
            hm1.put(ch,value);
        }
        for(int i=0;i<=s2.length()-1;i++)
        {
            char ch = s2.charAt(i);
            int value = hm2.getOrDefault(ch,0);
            value++;
            hm2.put(ch,value);
        }
        if(hm1.equals(hm2))
        {
            return true ;
        }
        else 
        {
            return false ;

        }
    }
}
