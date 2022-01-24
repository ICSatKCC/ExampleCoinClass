import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* PennyTest - a JUnit test for Penny.java.
* @author Lisa Miller
* @since 1/24/22
*/

public class PennyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Penny getNameTest.
   * Checks constructor and getName method
   */
   @Test public void getNameTest() {
      Penny p = new Penny();
      Assert.assertEquals("GetName returns incorrect name.", "Penny", 
          p.getName());
   
   }

   /**
   * Penny getValue test.
   * Checks constructor and getValue method
   */
   @Test public void getValueTest() {
      Penny p = new Penny();
      Assert.assertEquals("getValue returns incorrect Penny value", .01, p.getValue(), .001);
   
   }
   
   /**
   * Penny getColor test.
   * Checks constructor and getColor method
   */
   @Test public void getColorTest() {
      Penny p = new Penny();
      Assert.assertEquals("getColor returns incorrect Penny color", p.getColor(), "Copper");
   
   }
   
   /**
   * Penny getFront test.
   * Checks constructor and getFront method
   */
   @Test public void getFrontTest() {
      Penny p = new Penny();
      Assert.assertEquals("getFront returns incorrect Penny front", p.getFront(), "Abraham Lincoln");
   
   }
   
   /**
   * Penny getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getBackTest() {
      Penny p = new Penny();
      Assert.assertEquals("getBack returns incorrect Penny back", p.getBack(), "Lincoln Memorial");
   
   }
   
   

}
