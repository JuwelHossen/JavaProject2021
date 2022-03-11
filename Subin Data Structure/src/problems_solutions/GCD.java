package problems_solutions;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println( gcd(12,6));
    }

    public static int gcd(int number,int divisor){
        int remaining = number % divisor;
        if(remaining != 0)
        {
            return gcd(divisor,remaining);
        }
        else {
            return divisor;
        }
    }
}
