package hackerRank;

public class Permutation {
    public static void main(String[] args)
    {

        String s = "ABC";
        int len=s.length();
        permute( s, 0,len-1 );

    }

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                String swapped = swap(str, left, i);
                permute(swapped, left + 1, right);
            }

        }

    }

    public static String swap(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);

    }


}