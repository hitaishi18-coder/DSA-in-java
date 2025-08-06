// STRING TOKENIZER

import java.util.StringTokenizer;

public class FIFO 
{
    public static void main(String[] args) 
    {
        String s ="university bussiness school . ";
        System.out.println(shortForm(s));
    }  
    static String shortForm(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String answer =" ";
        for(int i=0;i<n;i++)
        {
            String p = st.nextToken();
            char ch = p.charAt(0);
            ch = Character.toUpperCase(ch);
            answer = answer+ ch + ".";
        }
        return answer ;
    } 
}   
