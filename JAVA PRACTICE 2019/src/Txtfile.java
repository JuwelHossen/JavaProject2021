import java.io.*;
import java.util.Scanner;

public class Txtfile {

    public static void main(String args[])  throws IOException
     {
        Scanner file = new Scanner(new File("input.txt")); 

        int numTimes = file.nextInt();
        //file.nextLine();

            for(int i = 0; i < numTimes; i++);
            {   
                int sum = 0;
                int count = 0;
              Scanner split = new Scanner(file.nextLine());
              while(split.hasNextInt())
                //for (int a = 0; a < 4 ; a++)
                {
        sum += split.nextInt();
        count++;
                }    
        System.out.println("the average is = " + ((double)sum / count));

            }
                }

}