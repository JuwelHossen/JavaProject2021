import java.util.*;
public class Ch2
{
  public static void main(String []args)
  {
    double numShare = 1000;
    double costPrice = 32.87;
    double sellPrice = 33.92;
    double comRate = 0.02;
    
    double totalCost= 0,totalSell= 0,sellCom,buyCom,profit;
    
    totalCost = numShare*costPrice; 
    buyCom = totalCost*comRate;
    totalCost = totalCost+buyCom;
    
    totalSell = numShare*sellPrice;
    sellCom = totalSell*comRate;
    totalSell= totalSell-sellCom;
    
    profit=totalSell-totalCost; 
    
    
    
    System.out.println(totalCost);   
    System.out.println(totalSell);
    
    System.out.println(sellCom);
    System.out.println(buyCom);
    
    System.out.println(profit);
    
    if( profit<0)
       System.out.println("You have lost money in your bussiness = :" +profit);
       else
        System.out.println("You make = "+profit);

    
      
    
    
    
  }
}

