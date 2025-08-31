public class print_03 {
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

        // first print then call new function 
        System.out.println(n);
        function(n-1);

        // this executes when returning 
        System.out.println(n);
    }
}

}