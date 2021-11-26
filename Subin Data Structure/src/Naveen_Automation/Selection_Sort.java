package Naveen_Automation;

public class Selection_Sort
{

	public static void main(String[] args)
	{
		int [] a = {6,4,3,2,1,9,8,7,5,10};
		
		for(int n: a) 
		{
		System.out.print(" "+n);
		}
		System.out.println();
		selectionSort(a,10);
		for(int n: a) 
		{
		System.out.print(" "+n);
		}
	
	}

	public static void selectionSort(int a[],int number)
	{
		int i,j,temp,min_index;
		for( i =0;i<number;i++) 
		{
			min_index=i;
			for( j=i+1;j<number;j++) 
			{
				if (a[j]<a[min_index])
				{
					min_index=j;
				}
				
			}//end for inner loop
			
			if(min_index != i)
			{
				temp =a[i];
				a[i]=a[min_index];
				a[min_index]=temp;	
			}
		}// end outter loop
		
	}
}
