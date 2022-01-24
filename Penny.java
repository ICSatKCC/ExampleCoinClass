/**
* Penny .01 value Coin Subclass.
* @author Lisa Miller
* @since 1/24/22
*/
public class Penny extends Coin {

  /**
  * Constructor, needs no parameters.
  * Sends default Penny values
  */
   public Penny() {
      super(.01, "Penny", "Abraham Lincoln", "Lincoln Memorial");
   }
   

   /**
   * Gets the color of a Penny.
   * Overrides superclass getColor method
   * @return the color of a Penny Coin.
   */
   @Override
   public String getColor() {
      return "Copper";
   }
}
