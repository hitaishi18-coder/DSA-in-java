import java.util.Arrays;

public class rearrange 
{
    public static void main(String[] args) 
    {
        String s = "RAKESH";
        System.out.println(reArrange(s));
    }
    static String reArrange(String s)
    {
        char a[] = s.toCharArray();
        Arrays.sort(a);
        String answer = new String(a);
        return answer ;
    }
    
}
