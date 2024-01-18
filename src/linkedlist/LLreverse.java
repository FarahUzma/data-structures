package linkedlist;

public class LLreverse {
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
    public void insert(int data)
    {
        Node n = new Node(data);
        if(head == null)
        {
            this.head = n;
        }
        else{
            Node p = head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=n;
        }
    }
    public void display(){
        Node p =head;
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }
    }
    /*
        1->3->5->7
q,r     p

        1<-3  5->7
           q   p,r

        1<-3<-5->7
              q  r,p

        1<-3<-5<-7  null
                 q  r,p
     */
    public void reverse()
    {
        Node p = head;
        Node q = null;
        Node r = null;
        while(p!=null)
        {
            r=p.next;
            p.next=q;
            q=p;
            p=r;
            head = q;
        }
    }


    public static void main(String args[])
    {
        LLreverse ll = new LLreverse();
        ll.insert(1);
        ll.insert(3);
        ll.insert(5);
        ll.insert(7);
        ll.display();
        ll.reverse();
        System.out.println("Reverse : ");
        ll.display();
    }
}
