
import java.util.Scanner;

class DLinkedList
{
    Node head;

 

    void deleteBeg() {
        Node temp = head;
        head = temp.next;
    }

    void deleteEnd() {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
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
public class DeleteLinkedList {
    public static void main(String args[])
    {
        DLinkedList l = new DLinkedList();
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements");
        int n = sc.nextInt();
        System.out.print("Enter elements");
        for(int i=0;i<n;i++)
        {
            l.push(sc.nextInt());
        }
        System.out.print("Original List");
        l.printList();
        System.out.print("List after deleting from beginning");
        l.deleteBeg();
        l.printList();
        System.out.print("List after deleting from end");
        l.deleteEnd();
        l.printList();
         
    }
}
