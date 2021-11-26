package array_Lafore2;

public class HighArrayApp
{
    public static void main(String[] args)
    {
        HighArray arr =new HighArray(10);

        arr.display();
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        //arr.display();

        arr.delete(10);
        arr.display();

    }
}
