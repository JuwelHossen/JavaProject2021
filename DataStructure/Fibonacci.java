package DataStructure;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(fivo(9));
    }

    public static int   fivo (int x)
    {
        if(x<1)
            return 0;
        else if(x==1 || x == 2)
            return 1;
        else
        {
            return fivo(x-1)+ fivo(x-2);

        }

    }

}
