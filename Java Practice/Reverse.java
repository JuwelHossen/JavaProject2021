import java.util.*;
public class Reverse
{
  public static void main (String []args)
  {
  
      int n ;

    Scanner p = new Scanner(System.in);
    System.out.println("Enter a number : ");
    
      n= p.nextInt();   
     
      
      
      int s=0,r;
      
      while(n>0)
      {
         r= n%10;
         n=n/10;
         s=(s*10)+r;
      }
      System.out.println(s);
  }
}