package binaryTree;

public class BtArray {
    String[] n = null;
    public void root(String data)
    {
        n = new String[10];
        n[0]=data;
    }
    public void setLeft(String data, int parentIndex)
    {
        int childI= parentIndex*2;
        n[childI+1] = data;
    }
    public void setRight(String data, int parentIndex)
    {
        int childI= parentIndex*2;
        n[childI+2] = data;
    }
    public static void main(String args[])
    {
        BtArray bt = new BtArray();
        bt.root("A");
        bt.setLeft("B", 0);
        bt.setRight("C", 0);
        bt.setLeft("D", 1);
        bt.setRight("E", 1);
        bt.setRight("F", 2);
        for(int i=0;i<bt.n.length;i++)
        {
            System.out.println(bt.n[i]);
        }
    }
}
