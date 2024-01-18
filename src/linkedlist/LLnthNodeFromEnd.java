package linkedlist;

public class LLnthNodeFromEnd {
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
        Node n = new Node(data);
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
    /*
    Input: 1 -> 2 -> 3 -> 4, N = 3
    Output: 2

    Solution:
    Move p by n steps from start
    Then move p and q together until p reaches last node
     */
    public Node displayNthNodeFromEnd(int n)
    {
        Node p = head;
        Node q = head;
        while(n!=1)
        {
            p=p.next;
            n--;
        }
        while(p.next!=null)
        {
           p=p.next;
           q=q.next;
        }
        return q;
    }

    public static void main(String args[])
    {
        LLnthNodeFromEnd l = new LLnthNodeFromEnd();
        l.insert(3);
        l.insert(1);
        l.insert(2);
        l.insert(31);
        l.insert(12);
        l.insert(23);
        System.out.println(l.displayNthNodeFromEnd(4).data);

    }
}
