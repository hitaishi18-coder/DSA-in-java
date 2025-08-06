import java.util.StringTokenizer;

public class reverse 
{
    public static void main(String[] args) 
    {
        String s = "hello world how are you ";
        System.out.println(reverseWords(s));
    }
    
    static String reverseWords(String s)
    {
        StringTokenizer st = new StringTokenizer(s);

        int n = st.countTokens();
        String answer = "";

        for(int i=1;i<=n;i++)                
        {
            String word = st.nextToken();
            
            StringBuffer sb = new StringBuffer(word);
            sb.reverse();
            answer = answer + sb.toString() + " ";
        }
        answer = answer.trim();
        return answer;
    }
    }
    

