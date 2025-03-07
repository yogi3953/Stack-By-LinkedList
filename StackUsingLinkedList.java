package Stack;
import java.util.Scanner;


class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class StackByLinkedList
{
    Node head=null;
    public Node insertionAtFront(int data,Node head)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public Node deletionAtFront(Node head)
    {
        if(head==null) return head;
        Node current=head;
        head=current.next;
        current=null;
        return head;
    }
    public void peek(Node head)
    {
        if(head==null)
        {
            System.out.println("No data to peek");
        }
        System.out.println("peek is:"+head.data);
    }
    public void display(Node head)
    {
        if(head==null)
        {
            System.out.println("No data");
        }
        while(head!=null)
        {
            System.out.print(head.data+" >> ");
            head=head.next;
        }
    }
}
class StackUsingLinkedList
{
    public static void main(String[]args)
    {
        StackByLinkedList sll=new StackByLinkedList();
        while(true)
        {
            System.out.println("Which Operation do you want to perform:");
            System.out.println("1.Insertion at Front  2.Deletion at Beginning 3.what is peek? 4)Simply print the list");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            if(choice==0 || choice>4)
            System.out.print("INVALID OPTION:PLEASE CHOOSE FROM ABOVE OPTIONS");
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter data: ");
                    int data=sc.nextInt();
                    sll.head=sll.insertionAtFront(data,sll.head);
                }
                    break;
                case 2:
                    sll.head=sll.deletionAtFront(sll.head);
                    break;
                case 3:
                    sll.peek(sll.head);
                     break;
                case 4:
                    sll.display(sll.head);
                    break;
                default:
                    System.out.print("Exiting...");
                    sc.close();
                    System.out.println("Invalid Options");
        }
    }
    }
}