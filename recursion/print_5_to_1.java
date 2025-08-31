

public class print_5_to_1 {
    public static void main(String[] args) {
        function(5);
    }
    static void function(int n )
    {
        if(n == 0 )
        {
            System.out.println("X");
        }
        else 
        {
            System.out.println(n);
            function(n-1);
        }
    }
}
