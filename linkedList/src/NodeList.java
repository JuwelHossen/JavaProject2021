package src;

public class NodeList
{
    class Node
    {
      private int  data;
      Node next;
    }

    Node head;

    public void insert(int data)
    {
        // Create Node
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;

        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Node n =head;

            while(n.next!=null)
            {
                n= n.next;
            }
            n.next=newNode;
        }





    }
    public void printNode()
    {
       Node node =head;

       while (node.next!=null)
       {
           System.out.println(node.data);
           node=node.next;
       }
        System.out.println(node.data);
    }

    //main method
    public static void main(String[] args)
    {
        NodeList nodeList=new NodeList();

        nodeList.insert(10);
        nodeList.insert(20);
        nodeList.insert(30);
        nodeList.insert(10);
        nodeList.printNode();
    }

}
