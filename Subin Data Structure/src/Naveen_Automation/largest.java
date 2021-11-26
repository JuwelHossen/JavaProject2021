package Naveen_Automation;

public class largest
{
    public static void main(String[] args) {
        int  [] arr = {1,4,5,6,100,-100,2,4,6};

        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]>max)
                max=arr[i];
            if (arr[i]<min)
               min=arr[i];
        }
        System.out.println(min);
        System.out.println(max);
    }


}
