import java.util.*;

public class Merge{
    public static void insert(Node head){
        Node t = head;
        Scanner s = new Scanner(System.in);
        Node ob = new Node();
        while(t.next != null){
            t = t.next;
        }
        ob.data = s.nextInt();
        ob.next = null;
        t.next = ob;
    }
    public static Node Merge(Node h1,Node h2){
        Node t = h1.next;
        
        while(t.next!=null){
            t = t.next;
        }
        
        t.next = h2.next;
        return h1;
    }
    public static void display(Node head){
        Node t = head.next;
        while(t!=null){
            System.out.print(t.data+"->");
            t = t.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        Node h1 = new Node();
        h1.next = null;

        Node h2 = new Node();
        h2.next = null;
        
        Node a = new Node();
        Node b = new Node();
        Scanner s = new Scanner(System.in);
        
        int as = s.nextInt();
        for(int i = 0;i < as;i++){
            insert(h1);
        }
        
        int bs = s.nextInt();
        for(int i = 0;i < as;i++){
            insert(h2);
        }
        
        Node mer = Merge(h1,h2);
        display(mer);
    }
}

class Node{
    int data;
    Node next;
}
