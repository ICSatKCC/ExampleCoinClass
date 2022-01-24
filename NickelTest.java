import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* NickelTest - a JUnit test for Nickel.java.
* @author Lisa Miller
* @since 1/24/22
*/

public class NickelTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Nickel getNameTest.
   * Checks constructor and getName method
   */
   @Test public void getNameTest() {
      Nickel p = new Nickel();
      Assert.assertEquals("GetName returns incorrect name.", "Nickel", 
          p.getName());
   
   }

   /**
   * Nickel getValue test.
   * Checks constructor and getValue method
   */
   @Test public void getValueTest() {
      Nickel p = new Nickel();
      Assert.assertEquals("getValue returns incorrect Nickel value", .05, p.getValue(), .001);
   
   }
   
   /**
   * Nickel getColor test.
   * Checks constructor and getColor method
   */
   @Test public void getColorTest() {
      Nickel p = new Nickel();
      Assert.assertEquals("getColor returns incorrect Nickel color", p.getColor(), "Silver");
   
   }
   
   /**
   * Nickel getFront test.
   * Checks constructor and getFront method
   */
   @Test public void getFrontTest() {
      Nickel p = new Nickel();
      Assert.assertEquals("getFront returns incorrect Nickel front", p.getFront(), "Thomas Jefferson");
   
   }
   
   /**
   * Nickel getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getBackTest() {
      Nickel p = new Nickel();
      Assert.assertEquals("getBack returns incorrect Nickel back", p.getBack(), "Monticello");
   
   }
   
   

}
