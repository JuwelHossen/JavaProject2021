package sorting;

import java.util.Arrays;

public class MergeSort
{
    public static void printArray(int [] A)

    {
        Arrays.stream(A).forEach(System.out::println);
    }

//    public static int [] mergeSort(int [] a) {
//        if (a.length <= 1) {
//            return a;
//        }
//
//
//    }


    public static void main(String[] args)
    {
        int [] array= {03,5,60,80,1,2,3,4,5,7};
        printArray(array);

    }

}
