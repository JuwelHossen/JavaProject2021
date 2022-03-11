package problems_solutions;

import java.util.Arrays;

public class PairsTwoSum {
    public static void main(String[] args) {
        int [] numbers={1,4,3,3,3,2,12};
        int target = 9 ;
        int [] arr = twoSum(numbers,target);
        System.out.println(Arrays.toString(arr));
    }

    private static int [] twoSum(int[] numbers, int target) {

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
        //throw new IllegalArgumentException("Not found the number");
    }
}
