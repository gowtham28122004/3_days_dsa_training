import java.util.*;

class Node {
    int data;
    Node next;
}

public class Stack {

    public static void push(Node head, int ele) {
        Node t = new Node();
        t.data = ele;
        t.next = head.next;
        head.next = t;
    }

    public static int pop(Node head) {
        if (head.next != null) {
            int t = head.next.data;
            head.next = head.next.next;
            return t;
        }
        System.out.println("Stack Underflow");
        return -1;
    }

    public static void peek(Node head) {
        if (head.next != null) {
            System.out.println("Top Element: " + head.next.data);
        } else {
            System.out.println("Stack is Empty");
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
        Node head = new Node();
        int maxSize;

        System.out.print("Enter maximum stack size: ");
        maxSize = s.nextInt();

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
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
                        System.out.print("Enter element to push: ");
                        int ele = s.nextInt();
                        push(head, ele);
                    } else {
                        System.out.println("Stack Overflow");
                    }
                    break;
                case 2:
                    int popped = pop(head);
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    break;
                case 3:
                    peek(head);
                    break;
                case 4:
                    System.out.println("Size: " + size(head));
                    break;
                case 5:
                    System.out.println(isEmpty(head) ? "Stack is Empty" : "Stack is Not Empty");
                    break;
                case 6:
                    System.out.println(isFull(head, maxSize) ? "Stack is Full" : "Stack is Not Full");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 7);
    }
}
