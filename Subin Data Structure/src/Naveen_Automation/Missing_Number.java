package Naveen_Automation;

public class Missing_Number
{
    public static void main(String[] args)
    {
      int []  a={1,2,3,4,5,7};
      int sum=0;
      int arraySum=0;

      int len=a.length;
      System.out.println("THE LENGTH OF ARRAY IS "+len);

      for (int i=0;i<=len;i++)
      {
         sum +=i;
      }
        System.out.println("TOTAL SUM : "+sum);

        for (int i=0;i<len;i++)
        {
            arraySum +=i;
        }
        System.out.println("SUM OF ARRAY IS : "+arraySum);

        System.out.println("MISSING NUMBER IS : "+(sum - arraySum));
    }
}
