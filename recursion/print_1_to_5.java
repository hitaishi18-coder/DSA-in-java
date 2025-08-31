public class print_1_to_5 {
    public static void main(String[] args) {
        function(5);
    }
    static void function(int n)
    {
        if(n == 0 )
        {
            System.out.println("X");
        }
        else 
        {
            function(n-1); // pehle copy bnayega fr print krega 
            System.out.println(n);
        }
    }
}
