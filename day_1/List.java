import java.util.*;
class Node
{
   int roll;
   Node nxt;
}
public class List{
    public static void insert(Node head)
    {
        Node ob=new Node();
        Scanner sc=new Scanner(System.in);
        ob.roll=sc.nextInt();
        ob.nxt=head.nxt;
        head.nxt=ob;
    }
    public static void display(Node head)
    {
        Node t=head.nxt;
        while(t!=null)
        {
            System.out.println(t.roll);
            t=t.nxt;
        }
    }
   public static void main(String args[]) 
   {
       Node head=new Node();
       head.nxt=null;
       insert(head);
       insert(head);
       insert(head);
       insert(head);
       display(head);
   }
}
