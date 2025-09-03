import java.util.Stack;

public class valid_paranthesis_37 {
    public static void main(String[] args) {
        String s = "((0))";

        // Call isValid() and print result
        System.out.println(isValid(s));
    }

    // Function to check if parentheses/brackets are valid
    public static boolean isValid(String s) {
        // Stack will store opening brackets
        Stack<Character> st = new Stack<>();

        // Traverse each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Case 1: If it's an opening bracket → push onto stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            // Case 2: If it's a closing bracket → check for match
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty → no opening bracket to match
                if (st.isEmpty()) return false;

                // Pop the last opening bracket from stack
                char start = st.pop();

                // Check if popped bracket matches the closing one
                if ((start == '(' && ch != ')') ||
                    (start == '{' && ch != '}') ||
                    (start == '[' && ch != ']')) {
                    return false; // Mismatch found
                }
            }
            // If character is not a bracket, we ignore it (e.g. digits, letters)
        }

        // At the end → stack must be empty for it to be valid
        return st.isEmpty();
    }
}
