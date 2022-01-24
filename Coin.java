/**
* Basic Coin super class.
* @author Lisa Miller
* @since 1/24/22
*/

public class Coin {
   //instance variables
   /** the Coin value. */
   private double value;
   /** the name of the Coin type. */
   private String name;
   /** the image on the front of the Coin. */
   private String front;
   /** the image on the back. */
   private String back;
   
   /** 
   * Two parameter constructor.
   * @param newValue the coin value
   * @param newName the coin type name
   */
   public Coin(double newValue, String newName, String newFront, String newBack) {
      this.value = newValue;
      this.name = newName;
      this.front = newFront;
      this.back = newBack;
   }

   //get methods
   /**
   * Gets the value of this Coin.
   * @return the value of the Coin.
   */
   public double getValue() {
      return this.value; 
   }
   
   /**
   * Gets the name of this Coin.
   * @return the name of the Coin.
   */
   public String getName() {
      return this.name;
   }
   
   /**
   * Gets the color of this Coin.
   * Always returns Silver as the default color.
   * @return the color of the Coin, Silver.
   */
   public String getColor() {
      return "Silver";
   }
   
   /**
   * Gets the description of the front image.
   * @return the front of the Coin.
   */
   public String getFront() {
      return this.front;
   }
   
   /**
   * Gets the description of the back image.
   * @return the back of the Coin.
   */
   public String getBack() {
      return this.back;
   }
   
   /**
   * Sets the description of the back image.
   * @param the back of the Coin.
   */
   public void setBack(String newBack) {
      this.back = newBack;
   }
  
}
