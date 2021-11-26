package search;

public class Linear_Search
{
	public static void main(String[] args) 
	{
		int a[] = {1,3,2,5,9,6,7,4};
		int index= linearSearch(a,a.length,5);
		System.out.println("index of "+index);
		
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		
		int index1=binarySearch(b,b.length,50);
		System.out.println("index of "+index1);
	}
	public static int linearSearch(int [] a,int length,int x)
	{
		int i;
	    for(i=0;i<length;i++)
	    {
	    	if (a[i]==x)
	    		return i;
	    }
		//return if not find element
		return -1;
	}
	
	public static int binarySearch(int [] a,int length,int x)
	{
		int left=0 ,right=length-1,    mid;
		
		while(left<=right)
		{
			mid =(left+right)/2;
			
			if(a[mid]==x)
				return mid;
			
			if (a[mid]<x)
			{
				left=mid+1;
			}
			if (a[mid]>x)
			{
				right=mid-1;
			}
		}
	
		return -1;
	}
}
