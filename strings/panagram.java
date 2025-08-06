import java.util.HashSet;
public class panagram 
{
    public static void main(String[] args) 
    {
        // contains A to Z letters 
        String s = "the quick brown fox jumps over a lazy dog ";
        System.out.println(checkIfPanagram(s));
    }
    public static Boolean checkIfPanagram(String s )
    {
        HashSet<Character>hs = new HashSet<>();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                hs.add(ch);
            }
        }
        if(hs.size()==26)
        {
            return true ;
        }
        else 
        {
            return false ;
        }
    }
    
}
