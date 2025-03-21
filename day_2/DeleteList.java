import java.util.*;

class Node {
    int data;
    Node next;
}

public class DeleteList {
    public static void insert(Node head) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data to insert at beginning: ");
        Node n = new Node();
        n.data = s.nextInt();
        n.next = head.next;
        head.next = n;
    }

    public static Node prev(Node head, int pos) {
        Node t = head;
        int c = 0;

        while (c < pos - 1 && t.next != null) {
            c++;
            t = t.next;
        }

        if (c == pos - 1) {
            return t;
        }
        System.out.println("Position Out Of Bounds.");
        return null;
    }

    public static void pos(Node head, int pos) {
        Scanner s = new Scanner(System.in);
        if (prev(head, pos) != null) {
            Node pre = prev(head, pos);
            Node ob = new Node();
            System.out.print("Enter data to insert at position " + pos + ": ");
            ob.data = s.nextInt();
            ob.next = pre.next;
            pre.next = ob;
        }
    }

    public static void delete(Node head, int pos) {
        if (prev(head, pos) != null) {
            Node pre = prev(head, pos);
            if (pre.next != null) {
                pre.next = pre.next.next;
                System.out.println("Deleted node at position " + pos);
            } else {
                System.out.println("No node exists at the specified position.");
            }
        }
    }

    public static void eleDel(Node head, int ele) {
        Node t = head;
        boolean found = false;
        while (t.next != null) {
            if (t.next.data == ele) {
                t.next = t.next.next;
                System.out.println("Deleted node with data: " + ele);
                found = true;
                break;
            }
            t = t.next;
        }
        if (!found) {
            System.out.println("Element Not Found.");
        }
    }

    public static void display(Node head) {
        Node t = head.next; // Skipping dummy head
        System.out.print("List: ");
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = new Node(); // Dummy head
        head.next = null;

        while (true) {
            System.out.println("\n1. Insert at beginning");
            System.out.println("2. Insert at position");
            System.out.println("3. Delete at position");
            System.out.println("4. Delete by element");
            System.out.println("5. Display list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    insert(head);
                    break;
                case 2:
                    System.out.print("Enter position to insert: ");
                    int posInsert = s.nextInt();
                    pos(head, posInsert);
                    break;
                case 3:
                    System.out.print("Enter position to delete: ");
                    int posDelete = s.nextInt();
                    delete(head, posDelete);
                    break;
                case 4:
                    System.out.print("Enter element to delete: ");
                    int ele = s.nextInt();
                    eleDel(head, ele);
                    break;
                case 5:
                    display(head);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
