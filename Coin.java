import java.util.Random;
/**
* Flippable Coin super class.
* @author Lisa Miller
* @since 9/9/2017
*/

public class Coin implements Flippable {
   //instance variables
   private double value;
   private String name;
   private String color;
   //added for flippable
   private int upSide;
   private int downSide;
   
   /** 
   * Two parameter constructor
   * @param value the coin value
   * @param name the coin type name
   */
   public Coin (double value, String name) {
      this.value = value;
      this.name = name;
      this.toss(); //randomly set upside/downSide
   }

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
      } 
      else {
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
      } 
      else { 
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