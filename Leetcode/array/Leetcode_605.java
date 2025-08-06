// You have a long flowerbed in which some of the plots are planted,
 //and some are not. However, flowers cannot be planted in adjacent plots.
// 
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty 
// and 1 means not empty, and an integer n, return true if n new flowers 
// can be planted in the flowerbed 
//without violating the no-adjacent-flowers rule and false otherwise.

    public class Leetcode_605 {
        public static void main(String[] args) {
            int flowerbed[] = {1, 0, 0, 1};
            int n = 1;
            System.out.println(canPlaceFlowers(flowerbed, n)); // Output: true
        }
    
        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            int len = flowerbed.length;
    
            for (int i = 0; i < len; i++) {
                if (flowerbed[i] == 0) {
                    // Check left and right neighbors
                    boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                    boolean rightEmpty = (i == len - 1 || flowerbed[i + 1] == 0);
    
                    if (leftEmpty && rightEmpty) {
                        flowerbed[i] = 1; // Plant a flower
                        count++;
                        if (count >= n) return true; // Early exit if we placed enough... is 
                        //    used to stop processing as soon as the goal is achieved 
                    }
                }
            }
            return count >= n; // ensures that the function return the correct 

            // result after checking all plots if the early exit is never triggered ]
        }
    }
