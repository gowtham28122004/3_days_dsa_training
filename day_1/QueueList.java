import java.util.*;

class Node{
    int roll;
    Node next;
}
public class QueueList{
    public static void insert(Node head){
        Node ob = new Node();
        Scanner sc = new Scanner(System.in);
        ob.roll = sc.nextInt();
        Node l = head;
        while(l.next != null){
            l = l.next;
        }
        l.next = ob;
        ob.next = null;
    }
    public static void display(Node head){
        Node t = head.next;
        while(t!=null){
            System.out.println(t.roll);
            t = t.next;
        }
    }
    public static void main(String[] args){
        Node head = new Node();
        head.next = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            insert(head);
        }
        display(head);
    }
}
