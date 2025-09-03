public class climbing_stairs_head_32 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways = " + ways(n, ""));
    }

    static int ways(int n , String ans ) {
        if(n == 0) {
            System.out.println(ans); 
            return 1;
        } 
        else if(n < 0) {
            return 0; 
        } 
        else {
            int ans1 = ways(n-1, ans+"1 "); 
            int ans2 = ways(n-2, ans+"2 "); 
            return ans1 + ans2;
        }
    }
}
