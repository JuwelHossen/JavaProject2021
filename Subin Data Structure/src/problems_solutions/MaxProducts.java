package problems_solutions;

import java.util.Arrays;

public class MaxProducts {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1,10,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int len = arr.length-1;
        int result= arr[len]*arr[len-1];
        System.out.println(result);

    }
}
