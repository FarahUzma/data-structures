package linkedlist;

public class DoubleLLReverse {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            this.head = n;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = n;
            n.prev = p;


        }
    }
        public void display() {
            Node p = head;
            while (p != null) {
                System.out.println(p.data);
                p = p.next;
            }
        }
    public void displayFromEnd() {
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.prev;
        }
    }
    public void reverse()
    {
        Node p=head;
        Node q=null,r=null;
        while(p!=null)
        {
            r = p.next;
            p.next = q;
            p.prev=r;
            q=p;
            p=r;
        }
        this.head=q;
    }

    /*
      null  1 <-> 3 <-> 5 <-> 7 <-> 11
      q,r   p
      p.next = 3
      p.prev = null

      p.next = null
      p.prev = 3

      null <- 1 <-> 3  <-> 5 <-> 7 <-> 11
              q     p      r

     */

    public static void main(String args[])
    {
        DoubleLLReverse ll=new DoubleLLReverse();
        ll.insert(1);
        ll.insert(3);
        ll.insert(5);
        ll.insert(7);
        ll.insert(11);
        ll.display();
        System.out.println("display from end: ");
        ll.displayFromEnd();
        ll.reverse();
        System.out.println("display after reverse");
        ll.display();
    }
}
