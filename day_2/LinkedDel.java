import java.util.*;

class Node{
    int roll;
    Node next;
}
public class LinkedDel{
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
    public static void pos(Node head, int pos) {
        Node t = head;
        int cp = 0;

        while (cp < pos - 1 && t.next != null) {
            t = t.next;
            cp++;
        }

        if (cp == pos - 1) {
            Node ob = new Node();
            Scanner s = new Scanner(System.in);
            System.out.print("Enter item to insert at position " + pos + ": ");
            ob.roll = s.nextInt();
            ob.next = t.next;
            t.next = ob;
        } else {
            System.out.println("Position out of bounds.");
        }
    }
    public static void delete(Node head,int pos){
        Scanner s = new Scanner(System.in);
        int c = 0;
        Node t = head;
        while(c < pos-1 && t.next != null){
            c++;
            t = t.next;
        }
        if(c == pos-1){
            t.next = t.next.next;
        }
        else{
            System.out.println("Position out of bounds.");
        }
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
        pos(head,3);
        display(head);
        delete(head, 5);
        display(head);
    }
}
