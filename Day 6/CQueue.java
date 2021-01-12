
import java.util.ArrayList;


class CircularQueue
{
    int size=5;
    int front=-1,rear=-1;
    ArrayList<Integer> c =new ArrayList<>();
    void enqueue(int i) {
        if(rear==size-1 && front==0)
        {
            System.out.print("Queue is full");
        }
        if(front==-1)
        {
            front++;
            rear++;
            c.add(rear,i);
        }
        else if(rear==size-1 && front!=0)
        {
            rear=0;
            c.set(rear,i);
        }
        else
        {
            rear++;
            if(front<=rear)
            {
                c.add(rear,i);
            }
            else
            {
                c.set(rear,i);
            }
            
        }
    }

    void displayQueue() {
        if(front==-1)
        {
            System.out.print("Queue is empty");
        }
        else if(front<=rear)
        {
            System.out.println("The elements are");
            for(int i=front;i<=rear;i++)
            {
                System.out.print(c.get(i)+" ");
            }
            System.out.println();
        }
        else
        {
             for(int i = front; i < size; i++) 
            { 
                System.out.print(c.get(i)+" "); 
            } 

            for(int i = 0; i <= rear; i++) 
            { 
                System.out.print(c.get(i)+" ");  
            } 
        }
    }

    void dequeue() {
        if(front == -1)
        {
            System.out.print("Queue is empty");
        }
        else
        {
            System.out.println(c.get(front)+" is removed");
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else if(front==size-1)
        {
            front =0;
        }
        else
        {
            front++;
        }
    }
}
public class CQueue {
    public static void main(String args[])
    {
        CircularQueue q = new CircularQueue();
        q.enqueue(4); 
        q.enqueue(22); 
        q.enqueue(41); 
        q.enqueue(12); 
        q.displayQueue();
        q.dequeue();
        q.displayQueue(); 
    }
}