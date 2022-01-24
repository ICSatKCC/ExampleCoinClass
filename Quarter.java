/**
* Quarter .25 value Coin Subclass.
* @author Lisa Miller
* @since 1/24/22
*/
public class Quarter extends Coin {
   /**
   * Constructor, needs no parameters.
   * Sends default Quarter values
   */
   public Quarter() {
      super(.25, "Quarter", "George Washington", "Eagle");
   }

   /**
   * Constructor, for State Quarters.
   * Sets special state backs
   */
   public Quarter(String state) {
      
      super(.25, "Quarter", "George Washington", "Eagle");
   
      switch (state) {
         case "Hawaii":
            super.setBack("Kamehameha");
            break;
         case "Nevada":
            super.setBack("stallions");
            break;
         case "California":
            super.setBack("Yosemite");
            break;
         default:
            //do nothing just leave Eagle
            break;
      } 
   }
   
   
}
