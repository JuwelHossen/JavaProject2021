package array_Lafore2;

public class HighArray
{
    int numElements;
    int [] array;

    public HighArray(int max)
    {
        array= new int[max];
        numElements=0;
    }
    // insert value in the array
    public void insert(int number)
    {
        array[numElements]=number;
        numElements++;
    }

    // find value from the array
    public boolean find(int number)
    {

        for (int i = 0; i < numElements; i++)
        {
            if (array[i] == number)
            {
               break;
            }
            else
                {
                return false;
            }


        }
            return true;
    }


    //Delete Element s of an array
    public void delete(int number)
    { int i;
        for ( i = 0; i < numElements; i++)
        {
            if (number==array[i])
            {
                break;
            }

        }
        if (i==numElements){
           System.out.println("Cant found the element");
        }
        else
        {
            for (int j = i; j < numElements; j++)
            {
                array[j]=array[j+1];
            }
            numElements--;
        }

     }


    // display all the element of an array
    public void display()
    {
        for (int i = 0; i < numElements; i++)
            System.out.println(array[i]);
    }


}
