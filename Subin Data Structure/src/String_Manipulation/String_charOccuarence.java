package String_Manipulation;

import java.util.Scanner;

public class String_charOccuarence
{
    static int charRepeate(String str, int number)
    {
        int slen = str.length();
        int p=0,r=0;

        p = number/slen;
        r = number%slen;


        int partial= (r==0) ? 0 :r;
        int strCount = p* strCount(str,slen) + strCount (str,partial);

                return strCount;
    }
    public static int strCount (String str, int num)
    {
        int count = 0;
        str = str.toLowerCase();
        for(int i=0; i<num;i++)
        {
            if (str.charAt(i) =='a')
            {
                count++;
            }
        }
        return  count;
    }




    public static void main(String[] args)
    {

        Scanner input =new Scanner(System.in);
         System.out.println("Enter a String ");
         String str= input.nextLine();
        //input.nextLine();
         System.out.println("Enter a Number");
         int  num= input.nextInt();

         System.out.println(charRepeate(str, num));




    }
}
