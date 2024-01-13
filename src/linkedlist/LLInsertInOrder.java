package linkedlist;

public class LLInsertInOrder {
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
    public void insert(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            head = n;
        } else{
            Node p = head;
            Node q = null;
            if(data < p.data)
            {
                n.next=p;
                head = n;
            }
            else{
                while(p!=null && p.next!=null){
                    if(data>p.data)
                    {
                        q=p;
                         p=p.next;
                    }
                    else
                        break;
                }
                if(data > p.data)
                {
                    p.next=n;
                }
                else
                {
                    q.next = n;
                    n.next = p;
                }
            }
        }
    }
    public void delete(int data)
    {
        Node p = this.head;
        Node q = null;
        if(p.data == data)
        {
            this.head=p.next;
        }
        else{
            while(p!=null){
                if(p.data != data){
                    q=p;
                    p=p.next;
                }else{
                    break;
                }
            }
            q.next=p.next;
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
        LLInsertInOrder ll = new LLInsertInOrder();
        ll.insert(5);
        ll.insert(2);
        ll.insert(9);
        ll.insert(1);
        ll.insert(3);
        ll.display();
        ll.delete(3);
        System.out.println("delete 3");
        ll.display();
        ll.delete(9);
        System.out.println("delete 9");
        ll.display();
        ll.delete(1);
        System.out.println("delete 1");
        ll.display();
        ll.delete(2);
        System.out.println("delete 2");
        ll.display();
        ll.delete(5);
        System.out.println("delete 5");
        ll.display();
    }
}
