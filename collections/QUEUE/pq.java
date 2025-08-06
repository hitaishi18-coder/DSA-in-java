package QUEUE;

import java.util.PriorityQueue;

public class pq 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(36);
        pq.add(32);
        pq.add(35);
        pq.add(33);
        pq.add(39);

        System.out.println(pq);


        // System.out.println(pq.remove());



        // System.out.println(pq);


      
        while(! pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
    }
}


// most important bahar niklega 

