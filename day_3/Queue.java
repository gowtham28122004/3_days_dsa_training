import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class Queue {
    
    // Enqueue: Add at the end
    public static void enqueue(Node head) {
        Scanner s = new Scanner(System.in);
        Node ob = new Node();
        ob.data = s.nextInt();
        ob.next = null;

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = ob;
    }

    // Dequeue: Remove from the front
    public static int dequeue(Node head) {
        if (head.next != null) {
            int c = head.next.data;
            head.next = head.next.next;
            return c;
        } else {
            System.out.println("Queue Underflow");
            return -1;
        }
    }

    public static void peek(Node head) {
        if (head.next != null) {
            System.out.println("Front Element: " + head.next.data);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public static int size(Node head) {
        Node t = head.next;
        int c = 0;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

    public static boolean isEmpty(Node head) {
        return head.next == null;
    }

    public static boolean isFull(Node head, int maxSize) {
        return size(head) >= maxSize;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = new Node(); // dummy head node
        head.next = null;

        System.out.print("Enter maximum queue size: ");
        int maxSize = s.nextInt();

        int choice;
        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Is Empty?");
            System.out.println("6. Is Full?");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    if (!isFull(head, maxSize)) {
                        System.out.print("Enter element to enqueue: ");
                        enqueue(head);
                    } else {
                        System.out.println("Queue Overflow");
                    }
                    break;
                case 2:
                    int dequeued = dequeue(head);
                    if (dequeued != -1) {
                        System.out.println("Dequeued: " + dequeued);
                    }
                    break;
                case 3:
                    peek(head);
                    break;
                case 4:
                    System.out.println("Size: " + size(head));
                    break;
                case 5:
                    System.out.println(isEmpty(head) ? "Queue is Empty" : "Queue is Not Empty");
                    break;
                case 6:
                    System.out.println(isFull(head, maxSize) ? "Queue is Full" : "Queue is Not Full");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 7);

        s.close();
    }
}
