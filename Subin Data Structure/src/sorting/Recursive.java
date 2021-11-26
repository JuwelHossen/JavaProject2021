package sorting;

public class Recursive
{
    public static void main(String[] args)
    {
        long  fact=factorial(10);
        System.out.println(fact);
        System.out.println(";;;;;;;;;;;;;;;;;");

        for (int i =0;i<10;i++)
         System.out.println(fibb(i));

    }

    public static long factorial(int x)
    {
        if(x==0)
            return 1;
        else
            return x * factorial(x-1);
    }

    public static int fibb(int x)
    {
            if (x<2)
              return x;

            else
                return (fibb(x-1)+ fibb(x-2));
    }



}
