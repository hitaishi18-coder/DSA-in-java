
import java.util.Arrays;

public class leetcode_66 {

    public static void main(String[] args) {
        int digit[] = {1, 2, 3, 4};  // Input array
        System.out.println(Arrays.toString(plusOne(digit)));  // Calling plusOne method and printing result
    }   

    // plusOne method is now static to be called from main
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If it's 9, set it to 0 and continue to the next more significant digit
            digits[i] = 0;
        }
        
        // If all digits were 9, we need to create a new array with an extra leading 1
        digits = new int[digits.length + 1];
        digits[0] = 1;  // Set the first digit to 1 (since the number was all 9's)
        
        return digits;
    }
}

