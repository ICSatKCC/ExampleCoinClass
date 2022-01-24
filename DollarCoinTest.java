import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* DollarCoinTest - a JUnit test for DollarCoin.java.
* @author Lisa Miller
* @since 1/24/22
*/

public class DollarCoinTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * DollarCoin getNameTest.
   * Checks constructor and getName method
   */
   @Test public void getNameTest() {
      DollarCoin p = new DollarCoin();
      Assert.assertEquals("GetName returns incorrect name.", "Dollar", 
          p.getName());
   
   }

   /**
   * DollarCoin getValue test.
   * Checks constructor and getValue method
   */
   @Test public void getValueTest() {
      DollarCoin p = new DollarCoin();
      Assert.assertEquals("getValue returns incorrect DollarCoin value", 1.0, p.getValue(), .001);
   
   }
   
   /**
   * DollarCoin getColor test.
   * Checks constructor and getColor method
   */
   @Test public void getColorTest() {
      DollarCoin p = new DollarCoin();
      Assert.assertEquals("getColor returns incorrect DollarCoin color", p.getColor(), "Gold");
   
   }
   
   /**
   * DollarCoin getFront test.
   * Checks constructor and getFront method
   */
   @Test public void getFrontTest() {
      DollarCoin p = new DollarCoin();
      Assert.assertEquals("getFront returns incorrect DollarCoin front", p.getFront(), "Sacagawea");
   
   }
   
   /**
   * DollarCoin getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getBackTest() {
      DollarCoin p = new DollarCoin();
      Assert.assertEquals("getBack returns incorrect DollarCoin back", p.getBack(), "Bald Eagle");
   
   }
   
   

}
