package Naveen_Automation;

public class String_Reverse
{
    public static void main(String[] args)
    {
        //using string and for loop
        String name= "Java";
        String reverse="";
        for (int i=name.length()-1;i>=0;i--)
        {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);

        //using reverse function
        StringBuffer stringBuffer =new StringBuffer(name);
        System.out.println( stringBuffer.reverse());

    }
}
