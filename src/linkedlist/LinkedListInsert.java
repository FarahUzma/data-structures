package linkedlist;

public class LinkedListInsert {
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
        public void display()
        {
            Node p = this.head;
            while(p!=null)
            {
                System.out.println(p.data);
                p=p.next;
            }
        }

    public static void main(String args[])
    {
        LinkedListInsert l = new LinkedListInsert();
        l.insert(3);
        l.insert(1);
        l.insert(2);
        l.display();

    }
}
