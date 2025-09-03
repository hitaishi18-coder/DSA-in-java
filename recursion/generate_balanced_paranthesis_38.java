public class generate_balanced_paranthesis_38 {
    public static void main(String[] args) {
        int N = 10;  
        // N means number of pairs of parentheses
        // Example: N=3 → generates 3 pairs like "((()))", "(()())", etc.

        generate(N, N, ""); 
        // Initially we have N opening and N closing brackets available
        // ans = "" (empty string to build upon)
    }

    // Recursive function to generate balanced parentheses
    static void generate(int open_remaining, int close_remaining, String ans) {
        // Base condition: when no brackets are left to place
        if (open_remaining == 0 && close_remaining == 0) {
            System.out.println(ans); // Print one valid combination
        } 
        else {
            // Case 1: Place an opening bracket "(" if available
            if (open_remaining > 0) {
                generate(open_remaining - 1, close_remaining, ans + "(");
            }

            // Case 2: Place a closing bracket ")" 
            // Allowed only if we still have closing brackets left
            // AND the number of closing brackets left is greater than opening
            // → ensures validity (never more ")" before "(" )
            if (close_remaining > 0 && open_remaining < close_remaining) {
                generate(open_remaining, close_remaining - 1, ans + ")");
            }
        }
    }
}
