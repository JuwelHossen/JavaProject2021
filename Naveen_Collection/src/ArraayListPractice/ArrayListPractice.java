package ArraayListPractice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("hello");

        System.out.println(list);
        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println("..................");
        // itreatoro
        for(String  o: list)
        {
                  System.out.println(o);
        }

        // lambda function

            list.stream().forEach(e ->System.out.println(e));

             System.out.println("..................");

           //     Itretor

        Iterator<String>   it = list.iterator();
        while (it.hasNext() )
        {
            System.out.println(it.next());
        }

        ArrayList<String> li =
                new ArrayList<>(Arrays.asList("hello","java"));

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,10));
        // Remove numbers from arraylist
        numbers.removeIf(num->num%2==1);
        System.out.println(numbers);

        //Retainall method using

        numbers.retainAll(Collections.singleton(2));
        System.out.println(numbers);

        //sublist also
        // number.subList(2,6)

        //numbers.toArray() make Regular array



        // remove duplicate from arraylist

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,3,2,1,2,3,1,4,5,2,21,4,2,6,3));
        Set<Integer> set = new HashSet<>(list1);
        System.out.println(set);


        System.out.println(list1.stream().distinct().collect(Collectors.toList()));
        System.out.println(list1);





    }

}
