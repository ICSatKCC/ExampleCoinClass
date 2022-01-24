import java.util.Random;
/**
* Flippable Coin super class.
* @author Lisa Miller
* @since 9/9/2017
*/

public class Coin implements Flippable {
   //instance variables
   /** the Coin value. */
   private double value;
   /** The Coin name. */
   private String name;
   /** The coin color. */
   private String color;
   //added for flippable
   /** The Coin side facing up. */
   private int upSide;
   /** The Coin side facing down. */
   private int downSide;
   
   /** 
   * Two parameter constructor.
   * @param newValue the coin value
   * @param newName the coin type name
   */
   public Coin(double newValue, String newName) {
      this.value = newValue;
      this.name = newName;
      this.toss(); //randomly set upside/downSide
   }

   //get methods
   /**
   * Gets the value of this Coin.
   * @return the value
   */
   public double getValue() {
      return this.value; 
   }
   /**
   * Gets the name of this Coin.
   * @return the name
   */
   public String getName() {
      return this.name;
   }
   
   /**
   * Gets the color of this Coin.
   * @return "Silver by default
   */
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
      } 
      else {
         upSide = 0;
         downSide = 1;
      }
   }
   
   /**
   * Randomly sets upSide and corresponding downSide.
   */
   @Override	
   public void toss() {
      Random r = new Random();
      upSide = r.nextInt(2);
      if (upSide == 0) {
         downSide = 1;
      } 
      else { 
         downSide = 0;
      }
   }
   
   /**
   * Returns the upSide.
   * @return the up facing side
   */
   @Override
   public int getUpSide() {
      return upSide;
   }
   
   /**
   * Sets the upSide.
   * @param i the new up facing side
   */
   @Override
   public void setUpSide(int i) {
      upSide = i;
   }
}
