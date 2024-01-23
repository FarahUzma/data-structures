package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BtDeleteRightMostLastNode {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void insert(int data)
    {
        Node n = new Node(data);
        if(root == null)
        {
            root = n;
        } else {
            Queue<Node> que = new LinkedList<>();
            que.add(root);
            while(!que.isEmpty()){
                Node p = que.peek();
                que.remove();
                if(p.left==null){
                    p.left = n;
                    break;
                } else{
                    que.add(p.left);
                }

                if(p.right==null){
                    p.right = n;
                    break;
                } else{
                    que.add(p.right);
                }

            }
        }

    }
    public void levelOrderDisplay()
    {
        Queue<Node> que = new LinkedList<>();
        que.add(this.root);
        while(!que.isEmpty()){
            Node p = que.peek();
            if(p!=null)
            {
                System.out.println(p.data);
                que.add(p.left);
                que.add(p.right);
            }
            que.remove();
        }
    }
    public static void main(String args[])
    {
        BtDeleteRightMostLastNode t = new BtDeleteRightMostLastNode();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.insert(7);
        t.levelOrderDisplay();

    }

}
