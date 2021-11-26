package Lambda_Expression;
public class Method_Referance
{
    public static void main(String[] args)
    {
        Hello bi =Test::test;
        bi.print();

    }

}
class Test{
    public static void test()
    {
        System.out.println(" Hello world");
    }

}


