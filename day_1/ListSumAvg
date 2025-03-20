import java.util.*;

class Node{
    int item;
    Node next;
}

public class ListSumAvg{
    public static void insert(Node head){
        Node obj = new Node();
        Scanner s = new Scanner(System.in);
        obj.item = s.nextInt();
        obj.next = head.next;
        head.next = obj;
    }
    public static int sum(Node head){
        Node t = head.next;
        int result = 0;
        while(t!=null)
        {
            result += t.item;
            t = t.next;
        }
        return result;
    }
    public static void main(String ars[]){
        Node head = new Node();
        head.next = null;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = s.nextInt();
        for(int i = 0;i < n;i++){
            insert(head);
        }
        int total = sum(head);
        System.out.println(total);
        System.out.println(total/n);
    }
}
