import java.util.*;
public class Diomond1
{
  public static void main (String []args)
  {
   int odd=6;
   int space=1;
  
   
    for (int i=1;i<=4;i++)
    {  
       
       for( int j=1; j<space;j++)
       {
         System.out.print("j");
       }
       
         
       for (int j=1;j<=odd-1;j++)
       {
        
         //System.out.print(k);
         //System.out.print(j);
         System.out.print("*");
       }
       
       odd=odd-2;
       System.out.println();
       space++;
    }
     
   }
  }