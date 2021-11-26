package array;

public class ReverseSentence
{
    public static void main(String[] args)
    {
        String str= "I am learning Java";
        String [] strArray =str.split(" ");
        System.out.println(strArray.length);
        for(int i =strArray.length-1;i>=0; i--)
        {
            System.out.print(strArray[i]+"\t");
        }
    }
}
