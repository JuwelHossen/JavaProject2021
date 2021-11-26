package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapPractice
{
    public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<>();

        map.put(null,null);
        map.put(2,"bangladesh");
        map.put(3,"banglades2");
        map.put(1,null);

        System.out.println(map.get(1));

        Iterator<Integer> it=map.keySet().iterator();
        while (it.hasNext())
        {
            Integer key = it.next();
            String value= map.get(key);

            System.out.println( key+ "     "+value);
        }

        System.out.println("........................");

        Iterator<Map.Entry<Integer,String>> it1=map.entrySet().iterator();
        while (it1.hasNext())
        {
            Map.Entry<Integer,String> entry=it1.next();

            System.out.println( entry.getKey()+ "     "+entry.getValue());
        }

        System.out.println("........................");

          map.forEach( (k,v)-> System.out.println(k+"    "+v));

    }
}
