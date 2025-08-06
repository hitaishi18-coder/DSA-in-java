import java.util.StringTokenizer;

public class initials
{
    public static void main(String[] args) 
    {
        String s = "international business machines ";
        System.out.println(initialName(s));
    }
    static String initialName(String s)
    
       {

        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String answer =" ";


        for(int i=0;i<n-1;i++)
        {
            String p = st.nextToken();
            char ch = p.charAt(0);
            ch = Character.toUpperCase(ch);
            answer = answer+ ch + ".";
        }
        String last = st.nextToken();
        answer = answer + last.toUpperCase();
        return answer ;
    }
}


