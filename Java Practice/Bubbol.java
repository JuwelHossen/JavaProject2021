import java.util.*;
public class Bubbol
{
  public static void Bub( int a [])
  {
    int temp,n;
    n=a.length;    
    
    for (int i=0; i<n-1;i++)
    {
       for (int j=0 ;j<n-1-i;j++)
       {
         if (a[j]>a[j+1])
         {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp; 
         }
       }
    }
  }
  
  public static void print(int a[])
  {
    int n=a.length;
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ,");
    }
  }
  //;;;;;;;;;;;;;
  
  
  public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
  //;;;;;;;;
  
  
  public static void main (String []args)
  {
    int b [] ={32,32,87,3,5,6,9};
    System.out.println("Before Sorted:");
    print(b);
    
    System.out.println("\n\nAfter Sorted:");
    Bub(b);
    print(b);
  }
}