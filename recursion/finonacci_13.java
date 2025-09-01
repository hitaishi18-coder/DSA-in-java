// head recursion 

public class finonacci_13 {
      public static void main(String[] args) {
        int N = 10;
        System.out.println(fibo(N));
    }
    static int fibo(int N )
    {
        if(N == 1)
        {
            return 0;
        }
        else if(N == 2)
        {
            return 1;
        }
        else 
        {
            return fibo(N-2) + fibo(N-1);
        }
    }
}
