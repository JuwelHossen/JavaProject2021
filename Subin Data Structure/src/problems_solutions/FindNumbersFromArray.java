package problems_solutions;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindNumbersFromArray {
    public static void main(String[] args) {
        int numbers []={2,2,3,4,5,6,7,9,0};
        int find = 19;
        boolean found=false;
       for(int i=0;i<numbers.length;i++){
           if(numbers[i]== find) {
               found = true;
               break;
           }
       }
        System.out.println(found);
    }
}
