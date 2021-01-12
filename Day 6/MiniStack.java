
import java.util.Stack;


//O(1)
class MStack
{
    Stack<Integer> s = new Stack<>();
    int min=0;
    void getMin() 
    {
        if(s.isEmpty())
        {
            System.out.print("Stack is empty");
        }
        else
        {
            System.out.print("Minimum element "+min);
        }
        
    }
    void push(int x)
    { 
        if(s.isEmpty())
        {
            min=x;
            s.push(min);
        }
        else
        {
            if(x<min)
            {
                min=x;
                s.push(min);
            }
        }
    }
    
}
public class MiniStack {
    public static void main(String args[])
    {
        MStack m = new MStack();
        m.push(6);
        m.push(4);
        m.push(10);
        m.push(8);
        m.push(2);
        m.push(7);
        m.push(1);
        m.getMin();
        
    }

   
}
