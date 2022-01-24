/**
* DollarCoin 1.00 value Coin Subclass.
* @author Lisa Miller
* @since 1/24/22
*/
public class DollarCoin extends Coin {
   /**
   * Constructor, needs no parameters.
   * Sends default Dollar values
   */
   public DollarCoin() {
      super(1.0, "Dollar", "Sacagawea", "Bald Eagle");
   }
   
    /**
    * Gets the color of a Dollar Coin.
    * Overrides superclass getColor method
    * @return the color of a DollarCoin Coin.
    */
   public String getColor() {
      return "Gold";
   }
}
