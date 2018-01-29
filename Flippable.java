/**
* Interface for objects that have flippable property.
* @author Lisa Miller
* @since  9/7/2017
*/

public interface Flippable {
  
  /**
  * Swaps caller's up-side
  */
  public void flip();
  
  /**
  * Randomly set caller's up-side
  */
  public void toss();
  
  /**
  * Sets up-side value
  * @param i the new up-side value
  */
  public void setUpSide(int i);
  
  /**
  * Returns the value of the up-side
  * @return the up-side
  */
   public int getUpSide();  
}