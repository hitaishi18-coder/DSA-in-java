import java.util.ArrayList;
import java.util.List;

public class subset_of_k_size_22 {
    public static void main(String[] args) {
        String s = "ABCDEF";

        System.out.println(subsets(s,2));
    }
      static List<String> subsets(String s, int k)

    {
        List<String> main_list = new ArrayList<>();
        subsets(s, k, 0 , "" , main_list);
        return main_list;
    }
    static void subsets(String s , int k , int i , String ans , List<String> main_List)
    {
        if(i == s.length())
        {
            if(ans.length()==k)
            {
                main_List.add(ans);
            }
        }

        else 
        {
            char ch = s.charAt(i);
            subsets(s, k, i+1, ans+ch , main_List);

            subsets(s, k,i+1, ans , main_List);
        }
    }
}
