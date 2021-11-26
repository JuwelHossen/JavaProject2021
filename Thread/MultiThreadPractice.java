package Thread;
import java.lang.Thread;
class Printer
{
    public void print(String name)
    {
        for (int i= 0; i<=1000;i++ )
       {
        System.out.println(" Your page  number is "+ name );
       }
    }
}

class Queue1 extends Thread
{
    Printer p;
    public  Queue1(Printer p)
    {
        this.p=p;
    }
    public void run()
    {
        p.print("juwel");
    }

}

class Queue2 extends Thread
{
    Printer p;
    public  Queue2(Printer p)
    {
        this.p=p;
    }
    public void run()
    {
        p.print("Rana");
    }

}


public class MultiThreadPractice
{
    // main methods main thread
    public static void main(String[] args) throws InterruptedException {
        System.out.println(" Application is started:");

        //Printer p = new Printer();
        //Runnable r= new Printer();
        //Thread th = new Thread(r);
        //th.start();
        Printer p = new Printer();
        Queue1 queue1 = new Queue1(p);
        Queue2 queue2 = new Queue2(p);

        queue1.start();
        queue1.join();
        queue2.start();


        // when multiple thread using same object need to be Syncronized




    }
}
