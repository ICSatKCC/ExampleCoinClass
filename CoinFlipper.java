/**
* Driver class for Flippable Coins.
* @author Lisa Miller
* @since 1/28/24
*/

public class CoinFlipper {
   /** main method.
   * @param args not used
   */
  public static void main( String [] args){
    
    //array of coins can hold all subclasses
    Coin[] coinArr = new Coin[3];  
    
    coinArr[0] = new DollarCoin();
    coinArr[1] = new Penny();
    coinArr[2] = (Coin)doubleFlip(coinArr[0]); //call doubleFlip
    
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
    
    for(int i = 0; i < coinArr.length; i++) {
      System.out.println(coinArr[i]);
    }
    
    
   
  }//close main
  
  /**
  * private static method for getting upside as a string
  * @param i the upSide int value
  * @return the upSide String value
  */
  private static String printUpSide(int i) {
    if (i == 1){
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
    f1.flip();
    f1.flip();
    int side = f1.getUpSide();
    Flippable c = new Quarter();
    
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