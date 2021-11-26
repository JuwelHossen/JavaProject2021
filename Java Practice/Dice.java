import java.util.Random;
public class Dice
{
  private int numSide;
  private int dieValue;
  
  
  
 public void roll()
 
   {
    Random ran = new Random();
    dieValue= ran.nextInt(numSide)+1;
   } 
  
  public int getValue()
  {
   return dieValue;
  }
  
  // constructor 
  public Dice(int numSideGiven)
  {
    numSide=numSideGiven;
    //roll();
  }
  /*
   public static void main(String [] args)

 {
   Dice d= new Dice(6);
   Dice e= new Dice(6);
   
   System.out.println(d.getValue());
   System.out.println(e.getValue());
   
  }*/
}