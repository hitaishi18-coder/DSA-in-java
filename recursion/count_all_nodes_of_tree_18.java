

public class count_all_nodes_of_tree_18 {
    public static void main(String[] args) {
        String s = "ABCDEF";
        int count[] = {0};
        subset(s, 0 , " " , count);
        System.out.println("count " + count[0]);
    }
    static void subset(String s , int i , String ans , int count [])
    {
        count [0] ++ ; 

        if(i == s.length())
        {
            // count node of base condition also 
            System.out.println(ans);
        }
        else 
        {
            // include 
            char ch = s.charAt(i);
            subset(s, i+1, ans+ch, count);

            // dont include 
            subset(s, i+1, ans, count);
        }
    }
}
