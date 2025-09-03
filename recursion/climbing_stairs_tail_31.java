public class climbing_stairs_tail_31 {
    public static void main(String[] args) {
        int n = 4 ;
        ways(n , "");   
    }
    static void ways(int n , String ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
        }
        else if(n < 0)
        {
            System.out.println("x");
        }
        else 
        {
            ways(n-1, ans+"1");
            ways(n-2, ans+"2");
        }
    }
}
