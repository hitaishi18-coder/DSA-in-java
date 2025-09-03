public class ways_to_score_tail_23 {
    public static void main(String[] args) {
        int N = 13;       // target score (humko 13 points banane hain)
        ways(N, "");      // recursion start kar rahe hain, initially empty answer ke saath
    }

    // Recursive function jo possible ways generate karega
    static void ways(int N , String ans )
    {
        // Base case 1: agar exact score ban gaya (N == 0)
        if(N == 0)
        {
            System.out.println(ans); // ek valid combination print kar do
        }
        // Base case 2: agar score negative ho gaya, iska matlab yeh path galat hai
        else if(N < 0)
        {
            // do nothing (iska matlab koi solution yahan se nahi niklega)
        }
        else 
        {
            // Recursive calls:
            // har step pe hum ya to 1 point le sakte hain, ya 3 points, ya 5 points

            // option 1: ek point (1) le lo
            ways(N-1, ans + "1");

            // option 2: teen points (3) le lo
            ways(N-3, ans + "3");

            // option 3: paanch points (5) le lo
            ways(N-5, ans + "5");
        }
    }
}
