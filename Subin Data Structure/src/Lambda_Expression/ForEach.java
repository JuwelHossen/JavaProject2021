package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class ForEach
{
    public static void main(String[] args)
    {
        List<String > names = Arrays.asList("abb","bb","cc");

       // names.forEach((s)->System.out.println(s));
        names.forEach(System.out::println);
    }
}
