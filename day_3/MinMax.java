import java.util.*;

class Node {
    int data;
    Node next;
}

public class MinMax {
    
    public static void insert(Node head) {
        Node t = head;
        Scanner s = new Scanner(System.in);
        Node ob = new Node();
        ob.data = s.nextInt();
        ob.next = null;

        while (t.next != null) {
            t = t.next;
        }
        t.next = ob;
    }

    public static int min(Node head) {
        Node t = head.next;
        if (t == null) {
            throw new NoSuchElementException("List is empty");
        }

        int c = t.data;
        while (t != null) {
            if (c > t.data) {
                c = t.data;
            }
            t = t.next;
        }

        return c;
    }

    public static int max(Node head) {
        Node t = head.next;
        if (t == null) {
            throw new NoSuchElementException("List is empty");
        }

        int c = t.data;
        while (t != null) {
            if (c < t.data) {
                c = t.data;
            }
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
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node h1 = new Node();
        h1.next = null;

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            insert(h1);
        }

        System.out.println("\nLinked List:");
        display(h1);

        int minValue = min(h1);
        int maxValue = max(h1);
        System.out.println("Minimum Value: " + minValue);
        System.out.println("Maximum Value: " + maxValue);

        s.close();
    }
}
