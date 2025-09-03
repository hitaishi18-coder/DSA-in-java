
import java.util.ArrayList;

public class josephus_problem_25 {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        System.out.println(findWinner(n,k));
    }
    static int findWinner(int n , int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(i);
        }
        int i = -1 ;
        while (true) { 
            System.out.println(al);
            i = (i+k) % al.size();
            al.remove(i);

            i = i-1;

            if(al.size() == 1)
            {
                break;
            }
        }

        return al.get(0);
    }
}
