package LambdaExample;

import java.util.*;

public class LambdaDemo
{
    public static void main(String[] args)
    {
        Person p1 = new Person(20,"MD","AANA");
        Person p2 = new Person(23,"MS","RAHMAN");
        Person p3 = new Person(22,"HD","MAA");
        Person p4 = new Person(10,"AB","SABA");

        List <Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

      // SORT THE LIST BY LAST NAME
        /*
        Collections.sort(list, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getLname().compareTo(o1.getLname());
            }
        });
        */
        //lamda doing samething

        Collections.sort(list,( po ,pm)->po.getLname().compareTo(pm.getLname()));




        //print all people name
        
        printAll(list);
    }
    public static void printAll(List<Person> p)
    {
        for (Person people: p)
        {
            System.out.println(people);
        }
    }
    
}
