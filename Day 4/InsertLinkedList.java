
import java.util.Scanner;

class ILinkedList
{
    Node head;

    void insertAny(int pos,int val) {
        Node n = new Node(val);
        int current=0;
        if(pos==0)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            Node prev =null;
            while(temp!=null)
            {
                if(current == pos)
                {
                  prev.next=n;
                  n.next=temp;
                }
                current++;
                prev=temp;
                temp=temp.next;
               
            }
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

public class InsertLinkedList {
    public static void main(String args[]){
        ILinkedList l = new ILinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements");
        int n = sc.nextInt();
        System.out.print("Enter elements");
        for(int i=0;i<n;i++)
        {
            l.push(sc.nextInt());
        }
        System.out.print("Enter position and element to insert");
        int pos = sc.nextInt();
        int val = sc.nextInt();
        l.insertAny(pos,val);
        l.printList();
    }
}
