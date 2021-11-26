package Lambda_Expression;

import java.util.function.BiConsumer;

public class Lambda
{

    public static void main(String[] args)
    {
       BiConsumer <Integer,Integer> bi= (a,b)->System.out.println(a+b);
        bi.accept(2,3);
    }
}
