public class N_C_R_14 {
    public static void main(String[] args) {
        int N = 4 ;
        int R = 2 ;
        System.out.println(combination(N,R));
    }
    static int combination(int N , int R )
    {
        if(R == 0 || R == N)
        {
            return 1 ;
        }
        else 
        {
            return combination(N-1, R-1) + combination(N-1, R);
        }
    }
}
