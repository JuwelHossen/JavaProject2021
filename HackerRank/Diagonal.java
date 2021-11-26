package HackerRank;

public class Diagonal
{
    public static void main(String[] args)
    {


        // diagnoal printing
        /*
         5  2   3
         4  5   6
         7  8   9
         (1+5+9)
         */

        int [][] twoDArray= {{5, 2, 3},{4, 5, 6},{7, 8, 9}};


        int leftToRight=0;
        int rightToLeft=0;

        int row=twoDArray.length;
        int col=twoDArray[0].length;

        int i=0,j=0,k=0,l= row-1;

        while (i<row&&j<col && k<row && l>=0)
        {
            leftToRight= leftToRight + twoDArray[i][j];
            rightToLeft=rightToLeft+twoDArray[k][l];

            i++;
            j++;
            k++;
            l--;
        }
        // printing  difference of dignol
        System.out.println(Math.abs(leftToRight-rightToLeft));











/*
        int [][] twoD = new int [4][5];
      int k=0;
        for (int i = 0; i<twoD.length;i++ )
        {
            for (int j=0;j<twoD[i].length;j++)
            {
                twoD[i][j]=k;
                 k++;
                 if(k>=10)
                     k=0;
            }
        }

        for (int i = 0; i<twoD.length;i++ )
        {
            for (int j=0;j<twoD[i].length;j++)
            {

                System.out.print(twoD[i][j]);
            }
            System.out.println("");
        }*/

    }
}
