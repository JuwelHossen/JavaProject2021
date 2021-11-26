package DataStructure;

public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(factorial(6));
    }
    public static int factorial(int x)
    {
        if (x==0)
            return 1;

        return x* factorial(x-1) ;
    }

}
