import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* DimeTest - a JUnit test for Dime.java.
* @author Lisa Miller
* @since 1/24/22
*/

public class DimeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Dime getNameTest.
   * Checks constructor and getName method
   */
   @Test public void getNameTest() {
      Dime p = new Dime();
      Assert.assertEquals("GetName returns incorrect name.", "Dime", 
          p.getName());
   
   }

   /**
   * Dime getValue test.
   * Checks constructor and getValue method
   */
   @Test public void getValueTest() {
      Dime p = new Dime();
      Assert.assertEquals("getValue returns incorrect Dime value", .10, p.getValue(), .001);
   
   }
   
   /**
   * Dime getColor test.
   * Checks constructor and getColor method
   */
   @Test public void getColorTest() {
      Dime p = new Dime();
      Assert.assertEquals("getColor returns incorrect Dime color", p.getColor(), "Silver");
   
   }
   
   /**
   * Dime getFront test.
   * Checks constructor and getFront method
   */
   @Test public void getFrontTest() {
      Dime p = new Dime();
      Assert.assertEquals("getFront returns incorrect Dime front", p.getFront(), "Franklin D. Roosevelt");
   
   }
   
   /**
   * Dime getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getBackTest() {
      Dime p = new Dime();
      Assert.assertEquals("getBack returns incorrect Dime back", p.getBack(), "torch");
   
   }
   
   

}
