package sorting;

public class Mystack
{
    int top=-1;
    int capacity=3;
    int  [] stack = new int [capacity] ;

    public void push(int n)
    {
        if(top<capacity-1)
        {
            top = top + 1;
            stack[top] = n;
        }
        else
            System.out.println("Stack is full");
    }

    public  int  pop()
    {
        if(top<0)
        {
            System.out.println("No more elements on the Stack");
            return -1;
        }
        int val = stack[top];
        top=top-1;
        return val;

    }

    public  int peek()
    {
        if(top<0)
        {
            System.out.println("No more elements on the Stack");
            return -1;
        }
        return stack[top];

    }


    public  void print()
    {
        for(int n: stack)
        {
           System.out.println(n);
        }
    }



    public static void main(String[] args)
    {
        Mystack obj = new Mystack();
        obj.push(4);
        obj.push(5);
        obj.push(6);

        obj.print();
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());

        obj.push(40);
        obj.push(50);
        obj.push(60);
        System.out.println(obj.peek());
    }
}
