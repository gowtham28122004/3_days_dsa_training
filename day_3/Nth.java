import java.util.*;

public class Nth{
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
    public static int nth(Node head){
        Node t = head;
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for(int i = 0;i < c;i++){
            t = t.next;
        }
        
        return t.data;
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

        
        Node a = new Node();
        Scanner s = new Scanner(System.in);
        
        int as = s.nextInt();
        for(int i = 0;i < as;i++){
            insert(h1);
        }
        
        display(h1);
        System.out.println(nth(h1));
    }
}

class Node{
    int data;
    Node next;
}
