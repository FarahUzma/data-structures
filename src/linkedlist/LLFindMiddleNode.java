package linkedlist;
/*
For example, if the given linked list is 1->2->3->4->5 then the output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print the second middle element.
For example, if the given linked list is 1->2->3->4->5->6 then the output should be 4.
Solution :
p,q at head
p moves 2 steps
q moves 1 step
 */
public class LLFindMiddleNode {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    public void insert(int data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = n;
        }
    }
        public void display() {
            Node p = head;
            while (p != null) {
                System.out.println(p.data);
                p = p.next;
            }
        }
    public Node findMiddleNode()
    {
        Node p = head,q=head;
        while(p.next!=null) {
            if(p.next.next!=null)
            {
                p = p.next.next;
                q = q.next;
            }else{
                return p.next;
            }
        }
        return q;
    }


    public static void main(String args[])
    {
        LLFindMiddleNode ll=new LLFindMiddleNode();
        ll.insert(1);
        ll.insert(3);
        ll.insert(5);
        ll.insert(7);
        ll.insert(11);
        ll.display();
        System.out.println("Middle Node:" + ll.findMiddleNode().data);
        LLFindMiddleNode ll2=new LLFindMiddleNode();
        ll2.insert(1);
        ll2.insert(3);
        ll2.display();
        System.out.println("Middle Node:" + ll2.findMiddleNode().data);
    }
}
