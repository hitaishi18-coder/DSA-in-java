

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while(true)
        {
            System.out.println("enter a number ");
            int n = sc.nextInt();

            if(n==0)
            {
                break;
            }
            al.add(n);
        }
        sc.close();
    }
    
}
