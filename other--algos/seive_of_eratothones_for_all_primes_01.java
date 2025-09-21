
public class seive_of_eratothones_for_all_primes_01
{
    public static void main(String[] args) 
    {
        int N = 50;
        System.out.println(countPrimes(N));
    }
    
    public static int countPrimes(int n) 
    {
        int count=0;
        
        for(int i=1; i<=n ; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        
        return count;
    }
    
    static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        else
        {
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            
            return true;
        }
    }
}