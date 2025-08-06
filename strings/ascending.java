import java.util.Arrays;

public class ascending 
{
    public static void main(String[] args) 
    {
        String s = "banana apple aa aaaaaa oranges grapes ";
        String arr[] = s.split(" ");
        Arrays.sort(arr);
        System.out.println("sorted array " + Arrays.toString(arr));
    }
}
