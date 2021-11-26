package hackerRank;
import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b)
    {
        int a_len=a.length();
        int b_len=b.length();

        // Complete the function
        if ( a_len != b_len)
            return false;

        a=a.toLowerCase();
        b=b.toLowerCase();

        int [] charArray =  new int[26];

        for (int i=0;i<a_len; i++)
        {
            char cur = a.charAt(i);
            int index= cur-'a';
            charArray[index]++;
        }
        for (int i=0;i<b_len; i++)
        {
            char cur = b.charAt(i);
            int index= cur - 'a';
            charArray[index]--;
        }
        for (int i=0;i<26; i++)
        {
            if(charArray[i] !=0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter A string");
        String a = scan.next();

        System.out.println( "Enter Another string");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//        int arr[]= new int[5];
//            arr[2]++;
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]++);
//        }

       // System.out.println(arr[1]++);


    }
}
