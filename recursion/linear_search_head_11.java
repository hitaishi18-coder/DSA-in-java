public class linear_search_head_11 {
    public static void main(String[] args) {
        int a[] = { 10 ,20,30,40,50,60,70,80,90,100 };
        System.out.println(search(a , 102, 0 , false));
    }

    static int search(int a[], int num , int i , boolean found )
    {
        if(found == true)
        {
            return (i-1);
        }
        else if(i == a.length)
        {
            return -1;
        }
        else
        {
            if(num == a[i])
            {
                found = true;
            }
            return  search(a, num, i+1, found);
        }
    }
}
