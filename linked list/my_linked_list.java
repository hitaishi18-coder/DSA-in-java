public class my_linked_list 
{
    Node start;
  

    // add 
    void add(int val)
    {
        if(isEmpty())     // First Add hoga 
        {
            Node nd = new Node(val);
            start = nd;
            System.out.println(val+"  added as first node");
        }
        else              // Add More
        {
            Node t = start;
            
            // Traverse and stop at last node
            while(t.next!=null)
            {
                t = t.next;
            }
            
            // Create new node
            Node nd = new Node(val);
            
            // attach next of last node to nd
            t.next = nd;
            
            System.out.println(val+" added to end of list");
        }
    }


    // add first 
    void addFirst(int val)
    {
         Node nd = new Node(val);
         nd.next = start;
         start = nd;
         System.out.println(val+"add to start of list");
    }



    // size 
    int size()
    {
        int count =0;
        Node t = start;
        while(t!=null)
        {
            count++;
            t = t.next;

        }
        return count ;
    }



// index of 
    int index(int val)
    {
        if (isEmpty())
        {
            return-1;
        }
        else 
        {
            Node t = start ;
            int i=0;
            boolean found = false ;
            while(t!=null)
            {
                if(t.val == val)
                {
                    found=true;
                    break;
                }
                else
                {
                    t = t.next;
                    i++;

                }
            }
            if(found)
            {
                return i;

            }
            else 
            {
                return -1;
            }
        }
    }




    // check if empty 

    boolean isEmpty()
    {
        if(start==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

    // delete 
    void delete(int index )
    {
        if(isEmpty())
        {
            // do nothing 
        }
        else if(index<0 || index>=size())
        {
           // do nothing .. out of list     
        }
        else if(index==0)
        {
            start = start.next;
        }
        else 
        {
           // traverse nd stop 1 index before ..
           Node t=start;
           int i=0;
           while(t!=null)
           {
            if(i==index-1)
            {
                break;
            }
            t=t.next;
            i++;
           }
           // now skip i th element by changing reference 
            t.next = t.next.next;
        }
            
        }




     // update 

     void update(int old_value , int new_value )
    {
        Node t = start ;
        while(t!= null)
        {
            if(t.val ==old_value)
            {
                t.val = new_value;
            }
            t = t.next;
        }
    }



    // 
    void printList()
    {
        // Print LinkedList
         Node t = start;
         
         System.out.print("start -->");
         while(t!=null)
         {
             System.out.print(t.val+" --> ");
             t = t.next;
         }
         System.out.println("X");
    }
}

