import java.util.*;

public class Duplicate{
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
    public static boolean duplicate(Node head){
        Node t = head.next;
        
        while(t.next != null){
            Node s = t.next;
            while(s != null){
                if(t.data == s.data){
                    return true;
                }
                s = s.next;
            }
            t = t.next;
        }
        
        return false;
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
        System.out.println(duplicate(h1));
    }
}

class Node{
    int data;
    Node next;
}
