import java.util.*;
public class Diomond
{
  public static void main (String []args)
  {
   int odd=1;
   int space=4;
  // del();
 
   
    for (int i=1;i<=4;i++)
    {  
       int k = 0;
       for( int j=1; j<space;j++)
       {
         System.out.print(" ");
       }  
       for (int j=1;j<=odd;j++)
       {
         if (j<=i)
         k=k+1;
         else
         k--;
         //System.out.print(k);
         //System.out.print(j);
         System.out.print("*");
       }
       
       odd=odd+2;
      System.out.println();
      space--;
    }
    
      bot();
  }
  ///////
 //..................... 
   public static void del ()
  {
   int odd=1;
   int space=4;
   
    for (int i=1;i<=4;i++)
    {  
       int k = 0;
       for( int j=1; j<space;j++)
       {
         System.out.print(" ");
       }  
       for (int j=1;j<=odd;j++)
       {
         if (j<=i)
         k=k+1;
         else
         k--;
         //System.out.print(k);
         //System.out.print(j);
         System.out.print("*");
       }
       
       odd=odd+2;
      System.out.println();
      space--;
    }
     
  }
//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
public static void bot ()
  {
   int odd=6;
   int space=2;
  
   
    for (int i=1;i<=4;i++)
    {  
       
       for( int j=1; j<space;j++)
       {
         System.out.print(" ");
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


  
 //........ 
}