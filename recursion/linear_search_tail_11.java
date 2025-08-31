public class linear_search_tail_11 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        search(a , 40 , 0 , false );
    }

    static void search(int a[] , int num , int i , boolean found)
    {
        if(found == true )
        {
            System.out.println("found at " + (i-1));
        }
        else if (i == a.length)
        {
            System.out.println("not found");
        }
        else 
        {
            if(num == a[i])
            {
                found = true;
            }

            search(a, num, i+1, found);
        }
    }
}
