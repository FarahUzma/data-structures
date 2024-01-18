package linkedlist;

public class LLmerge2Lists {
    /*
    Given two linked lists, insert nodes of second list into first list at alternate positions of first list. 
For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6, 
the first list should become 5->12->7->10->17->2->13->4->11->6 and second list should become empty. 
     */
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
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
    public void display()
    {
        Node p = this.head;
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }
    }
    public void merge(LLmerge2Lists l1,LLmerge2Lists l2)
    {
        Node p=l1.head;
        Node r = null;
        Node q=l2.head;
        Node s = null;
        while(p!=null && q!=null)
        {
            r = p.next;
            s = q.next;
            p.next =q;
            q.next = r;
            p=r;
            q=s;
        }
        l2.head = null;
    }
    public static void main(String args[])
    {
        LLmerge2Lists ll1 = new LLmerge2Lists();
        LLmerge2Lists ll2 = new LLmerge2Lists();
        ll1.insert(1);
        ll1.insert(3);
        ll1.insert(5);
        ll1.insert(7);
        ll2.insert(2);
        ll2.insert(4);
        ll2.insert(6);
        ll2.insert(8);
        ll1.display();
        ll1.merge(ll1,ll2);
        System.out.println("Merge :");
        ll1.display();
        System.out.println("ll2 :");
        ll2.display();
    }
}
