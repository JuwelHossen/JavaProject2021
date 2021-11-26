package Naveen_Automation;

import java.util.HashSet;
import java.util.Set;

public class Duplicate
{
    public static void main(String[] args)
    {
        String [] name={"juwel","juwel", "nehan", "rana", "rana"};

        for (int i=0;i <name.length;i++)
        {
            for (int j =i+1;j<name.length;j++)
            {
                if(name[i]==name[j])
                {
                    System.out.println(name[i]);
                }
            }
        }

        System.out.println("-----------------");

        // using set


        Set<String> set = new HashSet<String >();
        for (String names: name)
        {
            if(set.add(names)==false)
            {
                System.out.println(names);
            }
        }
/// using map


    }
}
