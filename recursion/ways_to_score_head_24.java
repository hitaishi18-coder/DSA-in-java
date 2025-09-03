public class ways_to_score_head_24
{
    public static void main(String[] args)
    {
        int N = 13;  
        
        // yeh total number of ways return karega
        System.out.println(ways(N, ""));  
    }
    
    // Recursive function jo count karega ki kitne ways hain
    static int ways(int N, String ans)
    {
        //  Base case 1: agar exact score ban gaya (N == 0)
        if(N == 0)
        {
            //System.out.println(ans); // yahan hum combination print bhi kar sakte the
            return 1; // ek valid way mila → count = 1
        }
        // Base case 2: agar score negative ho gaya
        else if(N < 0)
        {
            return 0; // koi valid way nahi hai → count = 0
        }
        else
        {
            // Recursive breakdown:
            // Har step pe hum 3 choices try karenge (1, 3, 5 points lena)

            // option 1: agar hum 1 lete hain
            int ans1 = ways(N-1, ans+"1 ");
            
            // option 2: agar hum 3 lete hain
            int ans2 = ways(N-3, ans+"3 ");
            
            // option 3: agar hum 5 lete hain
            int ans3 = ways(N-5, ans+"5 ");
            
            // teeno choices ke counts ko add kar do
            return ans1 + ans2 + ans3;
        }
    }
}
