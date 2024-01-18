package linkedlist;

public class LLdetectLoop {
    /*
    Created Linked list: 1 --> 2 --> 3 --> 4 --> 5 --> 4 --> 4 --> NULL
    List after deletion of 4: 1 --> 2 --> 3 --> 4 --> 5 --> 4 --> NULL
     */
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int data) {
        LLdetectLoop.Node n = new LLdetectLoop.Node(data);
        if (head == null) {
            this.head = n;
        }
        else{
            Node p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=n;
        }
    }
    public boolean detectCycle()
    {
        Node p = head;
        Node q = head;
        while(p.next!=null && p.next.next!=null)
        {
            q=q.next;
            p=p.next.next;
            if(q==p)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        LLdetectLoop l = new LLdetectLoop();
        l.insert(3);
        l.insert(1);
        l.insert(2);
        l.insert(4);
        l.insert(5);
        System.out.println(l.detectCycle()?"Cycle Exists":"No cycle");
        l.head.next.next.next.next = l.head;
        System.out.println(l.detectCycle()?"Cycle Exists":"No cycle");
    }
}
