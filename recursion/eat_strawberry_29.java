public class eat_strawberry_29 {
    public static void main(String[] args) {
        int n = 5;
        ways(n);
    }

    static void ways(int n)
    {
        ways(n,"");
    }

    static void ways(int n , String ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
        }
        else if(n<0)
        {
            // System.out.println("X");
        }
        else 
        {
            for(int i = 1 ; i<= 2 ; i++)
            {
                ways(n-i , ans+i+"");
            }
        }
    }
}
