package problems_solutions;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arrA= {1,2,3,4,6,7,8,9,10};
        int len=10;
        System.out.println( missingNumber(arrA, len ));
    }

    private static int missingNumber(int[] arrA , int len) {
        int missingNumber=-1;
        int actual = (len * (len + 1))/2;
        int sum = Arrays.stream(arrA).sum();
        missingNumber = actual-sum;
        System.out.println(actual);
        System.out.println(sum);
        if(missingNumber==0)
        {
            return -1;
        }
        return missingNumber;
    }

}
