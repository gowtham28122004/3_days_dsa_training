import java.util.*;

public class StrictDecreasing{
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
    public static boolean strictDec(Node head){
        Node t = head.next;
        
        while(t.next != null){
            if(t.data < t.next.data){
                return false;
            }
            t = t.next;
        }
        
        return true;
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
        System.out.println(strictDec(h1));
    }
}

class Node{
    int data;
    Node next;
}
