package randomProblem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class FindLast{

 public static void main(String[] args) throws NumberFormatException, FileNotFoundException 
   {
            
     Scanner scan = new Scanner(System.in);
      int input;
      while(true)
        {
          System.out.print("Enter a number:");
          if(scan.hasNextLine())
          {
             input = scan.nextInt();
             int index = findLast(input);
             if(index == 0)
             System.out.println(input+" does not appear in the file ");
             else
               System.out.println(input+" last appears in the file at position "+index);
          }
          else
              break;
      }
     scan.close();
     
 }
       
       
public static int findLast(double val) throws FileNotFoundException

       {
             int position = 0;

             int curr = 0;

             File file = new File("numbers.txt");

             Scanner fileInput = new Scanner(file);

             while(fileInput.hasNext())

             {      curr++;

                    if((fileInput.nextDouble()) == val)

                           position = curr;

             }

             fileInput.close();

             return position; 

           
    }

}