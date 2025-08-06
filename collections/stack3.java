import java.util.Stack;

public class stack3 
{
    public static void main(String[] args) 
    {

      Stack<Integer> st = new Stack<>();   
      st.push(10);
      st.push(20);
      st.push(30);
      st.push(40);
      st.push(50);


      System.out.println(st);


      System.out.println("-----------");


      while(!st.isEmpty())
      {
        System.out.println(st.pop());
      }
    }
    
}
