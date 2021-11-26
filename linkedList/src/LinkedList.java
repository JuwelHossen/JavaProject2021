package src;

public class LinkedList
{
    Node head;
    //Node tail;

   public void insert(int i)
   {
       Node node = new Node();
       node.data=i;
       node.next=null;

       if (head==null)
       {
           head=node;
       }else
       {
         Node n = head;
         while(n.next != null)
         {
             n=n.next;
         }
           n.next= node;
       }

   }
public void printNode()
    {
       Node node = head;
       while(node.next != null)
       {
           System.out.println(node.data);
           node=node.next;
       }
        System.out.println(node.data);
    }

}
