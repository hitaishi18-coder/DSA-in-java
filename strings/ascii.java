import java.util.StringTokenizer;

public class ascii 
{
    public static void main(String[] args) 
    {
        String s = "hitaishi lohtia";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String word = st.nextToken();

            int weight = 0;
            for(int i=0;i<word.length() ;i++)
            {
                    weight  = weight + word.charAt(i);
            }
            System.out.println(word + " ----> " + weight);
        }                          
    }
}
