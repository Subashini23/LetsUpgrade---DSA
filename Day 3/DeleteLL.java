
import java.util.Scanner;


class Linked_list
{
    Node head;

    void delete(int pos) {
        int current = 0;
        Node temp=head;
        if(pos==0)
        {
            head=temp.next;
        }
        else
        {
            Node prev=null;
            while(temp!=null && current!=pos)
            {
                current++;
                prev=temp;
                temp=temp.next;
                
            }
            prev.next=temp.next;
            
        }
        
    }
    class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            data=value;
            next=null;
        }
    }
    void push(int d)
    {
        Node n = new Node(d);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class DeleteLL {
    public static void main(String args[])
    {
        Linked_list l = new Linked_list();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements");
        int n = sc.nextInt();
        System.out.print("Enter elements");
        for(int i=0;i<n;i++)
        {
            l.push(sc.nextInt());
        }
        System.out.print("Enter position to delete");
        int pos = sc.nextInt();
        l.delete(pos);
        l.printList(); 
        
    }
}
