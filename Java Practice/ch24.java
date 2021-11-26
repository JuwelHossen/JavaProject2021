import java.util.*;
public class ch24
{
 public static void main(String [] args) 
 { 
   int numRow=10;
   int midRow=(numRow+1)/2;
   int diff=0;
   
   for(int i=1;i<numRow;i++)
   { 
     for(int j=1;j<numRow+1;j++)  
     {
      if ((midRow-diff)<=j&&(j<=midRow+diff))
      {
       System.out.print("*");
      }
      else
      {
      System.out.print(" ");
      }
     }
     
     System.out.println();
     if(i<midRow)
     {
      diff++;
     }
     else 
     diff--; 
   }
   
   
  
   
 }
  
}