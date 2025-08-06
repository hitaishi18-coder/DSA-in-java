package QUEUE;

import java.util.ArrayDeque;

public class queue 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addFirst(90);
        dq.addFirst(80);

         
        System.out.println(dq);

        while(! dq.isEmpty())
        {
            System.out.println(dq.removeFirst());
        }
    }
    
}


// same order se bahar niklega 
