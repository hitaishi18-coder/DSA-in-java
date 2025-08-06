public class testing_linkedlist
{
    public static void main(String[] args)
    {
        my_linked_list ll = new my_linked_list();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);


        System.out.println("---------");


        ll.addFirst(19);
        ll.addFirst(28);

       System.out.println("---------");
        System.out.println("size" + " " +ll.size());


        System.out.println("index of :" + ll.index(50));
        System.out.println("---------");
      

        ll.delete(2);
        System.out.println("---------");


        ll.update(30,35);
        System.out.println("---------");

        ll.printList();
    }
    
}

