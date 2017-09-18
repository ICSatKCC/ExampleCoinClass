/**
* Driver class for Flippable Coins
* @author Lisa Miller
* @since 9/9/2017
*/

public class CoinFlipper{
  public static void main( String [] args){
    
    //array of coins can hold all subclasses
    Coin[] coinArr = new Coin[2];  
    
    coinArr[0] = new Dime();
    coinArr[1] = new Penny();
    
    for (int i = 0; i < coinArr.length; i++){
      System.out.print("Coin type: " + coinArr[i].getName() + "\tValue: " + coinArr[i].getValue());
      System.out.println("\tColor: " + coinArr[i].getColor() + "\tUp Side: " + coinArr[i].getUpSide());
    }
   
    //do ten coin tosses:
    for (int i = 0; i < 10; i++) {
      System.out.print(printUpSide(coinArr[0].getUpSide()) + " -> ");
      coinArr[0].toss();
      System.out.println(printUpSide(coinArr[0].getUpSide()));
    }
   
  }//close main
  
  /**
  * private static method for getting upside as a string
  * @param i the upSide int value
  * @return the upSide String value
  */
  private static String printUpSide(int i) {
    if (i == 0){
      return("Heads");
    }else { 
      return("Tails");
    }
  }
  
  /**
  * mathod that takes in a flippable object, makes a new coin based on the side
  * and returns it
  * @param an object to get side
  * @return a new COin object
  */
  public static Flippable doubleFlip(Flippable f1){
    int side = f1.getUpSide();
    Coin c = new Penny();
    
    switch(side){
      case 0:
        c = new Penny();
        break;
      case 1:
        c = new Nickel();
        break;
    }
    return c;
  }//end doubleFlip

}//close class