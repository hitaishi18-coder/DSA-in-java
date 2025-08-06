
import java.util.Arrays;

public class anagram 
{
    public static void main(String[] args) 
    {
        String s1 = "ABC";
        String s2 = "BCA";
        System.out.println(checkAnagram(s1,s2));
    }
    static boolean checkAnagram(String s1 , String s2)
    {
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
