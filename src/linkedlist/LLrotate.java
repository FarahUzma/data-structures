package linkedlist;

public class LLrotate {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
        }
    }

    public void display() {
        Node p = this.head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    /*
     * Input: linked list = 10->20->30->40->50->60, k = 4
     * Output: 50->60->10->20->30->40.
     */

    public void rotate(int n) {
        Node p = head;
        Node q = head;
        Node r = head;
        while (n != 1) {
            q = p;
            p = p.next;
            n--;
        }
        q.next = null;
        head = p;
        while (p.next != null) {
            p = p.next;
        }
        p.next = r;

    }

    public static void main(String args[]) {
        LLrotate l = new LLrotate();
        l.insert(3);
        l.insert(1);
        l.insert(2);
        l.insert(5);
        l.insert(6);
        l.display();
        System.out.println("rotate by 4");
        l.rotate(4);
        l.display();

    }
}
