package Naveen_Automation;

public class Junk
{
    public static void main(String[] args)
    {
      String junk = "@%^&&**(((juwelKKKK2020";
      // regular expression

       String j= junk.replaceAll("[^a-z0-9]","");
        System.out.println(j);
    }
}
