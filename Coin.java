import java.util.Random;
/**
* Flippable Money Coin abstract super class.
* @author Lisa Miller
* @since 9/9/2017
*/

public abstract class Coin implements Flippable, Money {
  //instance variables
  private double value;
  private String name;
  private String color;
  //added for flippable
  private int upSide;
  private int downSide;
  
  /** 
  * Two parameter constructor
  * CANNOT BE INSTANTIATED BY ITSELF
  * @param v the coin value
  * @param n the coin type name
  */
  public Coin (double v, String n) {
    this.value = v;
    this.name = n;
    this.toss(); //randomly set upside/downSide
  }
  
  //abstract method - not implemented here
  public abstract String getBack();

/*********** Rest is the same ******************/
  //get methods
  public double getValue() {
    return this.value; 
  }
  public String getName() {
    return this.name;
  }
  
  //getColor method returns "Silver"
  //by default
  public String getColor() {
    return "Silver";
  }
  

  /**
  * Switches value of upSide and downSide.
  */
  @Override
  public void flip() {
    if (upSide == 0) {
      upSide = 1;
      downSide = 0;
    } else {
      upSide = 0;
      downSide = 1;
    }
  }
  
  /**
  * Randomly sets upSide and corresponding downSide
  */
  @Override	
  public void toss() {
    Random r = new Random();
    upSide = r.nextInt(2);
    if (upSide == 0){
      downSide = 1;
    } else { 
      downSide = 0;
    }
  }
  
  /**
  * Returns the upSide
  * @return the up facing side
  */
  @Override
  public int getUpSide () {
    return upSide;
  }
  
  /**
  * Sets the upSide
  * @param i the new up facing side
  */
  @Override
  public void setUpSide (int i) {
    upSide = i;
  }
}