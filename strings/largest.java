import java.util.StringTokenizer;

public class largest 
{
   public static void main(String[] args) 
   {
      String s = "hello world how are you hitaishi";
      StringTokenizer st = new StringTokenizer(s);
      String largestWord = " ";   // initial as an empty string ...

      while(st.hasMoreTokens())   // check if there is more token left
      {
        String word = st.nextToken();
        if(word.length() > largestWord.length())
        {
            largestWord = word ;
        }
      }
      System.out.println("largest word is " + largestWord);
   }    
}

