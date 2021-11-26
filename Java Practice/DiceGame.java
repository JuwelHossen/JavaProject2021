public class DiceGame
{
 public static void main(String[]args)
 {
 
    Dice user= new Dice(6);
    Dice com= new Dice(6);
    
    int userWin=0;
    int comWin=0;
    int tie=0;
    for (int i=1;i<=10;i++)
    {
       user.roll();
       com.roll();
       System.out.print (user.getValue());
       System.out.print (" , "+com.getValue());
       
       if (user.getValue()>com.getValue())
       {
         userWin++;
       }
        else if(user.getValue()<com.getValue())
       {
        comWin++;
       }
       else
       tie++;
      System.out.println();

    }
      System.out.println("\n.............");

       System.out.println("User win     : "+userWin);
       System.out.println("Computer Win : "+comWin);
       System.out.println("The game tie : "+tie);
 }
}