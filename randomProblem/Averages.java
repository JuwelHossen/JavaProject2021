package randomProblem;

import java.util.Scanner;
import java.io.*;

/**
 This program reads a series of numbers from a file and
 accumulates their sum.
 */

public class Averages
{
    public static void main(String[] args) throws IOException
    {
        double sum = 0.0;   // Accumulator, initialized to 0
        int  num=0;
        double avg =0.0;
        int set=0;

        // Open the file for reading.
        File file = new File("numbers.txt");
        Scanner inputFile = new Scanner(file);


while(inputFile.hasNext())
    {
        int number = inputFile.nextInt();
        sum = 0.0;
        System.out.print("The average of the "+number+" integers ");
        for (int i = 0; i < number; i++)
        {
         num = inputFile.nextInt();
         sum = sum + num;
         System.out.print(num+" ");
        }
        avg= sum/number;
        System.out.print("is "+avg);

        set++;
        System.out.println();
     }
        System.out.print(set+" sets of numbers processed");
    }
}
