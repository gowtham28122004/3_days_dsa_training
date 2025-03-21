import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class ListLenSer {
    public static void insert(Node head) {
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        Scanner s = new Scanner(System.in);
        Node newNode = new Node();
        newNode.data = s.nextInt();
        newNode.next = null;
        t.next = newNode;
    }

    public static int length(Node head) {
        Node t = head.next;
        int c = 0;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

    public static void display(Node head) {
        Node t = head.next;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
    
    public static void search(Node head,int e)
    {
        Node t=head.next;
        Scanner sc=new Scanner(System.in);
        int c=0;
        while(t!=null && t.data!=e)
        {
            t=t.next;
            c++;
        }
        if(t==null)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Found at pos="+(c+1));
        }
    }

    
    public static void main(String[] args) {
        Node head = new Node();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 elements to insert:");
        for (int i = 0; i < 5; i++) {
            insert(head);
        }
        System.out.println("Linked List:");
        display(head);
        System.out.println("Length: " + length(head));
        search(head,4);
    }
}
