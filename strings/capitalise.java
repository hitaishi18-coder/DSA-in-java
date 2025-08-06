import java.util.StringTokenizer;


public class capitalise 
{
    public static void main(String[] args) 
    {
        String s = "java is Fun to Learn";
        StringTokenizer st = new StringTokenizer(s);
        String newString = " ";
        while(st.hasMoreTokens())
        {
            String word = st.nextToken();
            String capital_word = word.substring(0,1).toUpperCase() + 
                                                  word.substring(1).toLowerCase();
            
        newString = newString + capital_word + " ";
        }
        newString = newString.trim();
        System.out.println(newString);    
    }
    
}
