import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* QuarterTest - a JUnit test for Quarter.java.
* @author Lisa Miller
* @since 1/24/22
*/

public class QuarterTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Quarter getNameTest.
   * Checks constructor and getName method
   */
   @Test public void getNameTest() {
      Quarter p = new Quarter();
      Assert.assertEquals("GetName returns incorrect name.", "Quarter", 
          p.getName());
   
   }

   /**
   * Quarter getValue test.
   * Checks constructor and getValue method
   */
   @Test public void getValueTest() {
      Quarter p = new Quarter();
      Assert.assertEquals("getValue returns incorrect Quarter value", .25, p.getValue(), .001);
   
   }
   
   /**
   * Quarter getColor test.
   * Checks constructor and getColor method
   */
   @Test public void getColorTest() {
      Quarter p = new Quarter();
      Assert.assertEquals("getColor returns incorrect Quarter color", p.getColor(), "Silver");
   
   }
   
   /**
   * Quarter getFront test.
   * Checks constructor and getFront method
   */
   @Test public void getFrontTest() {
      Quarter p = new Quarter();
      Assert.assertEquals("getFront returns incorrect Quarter front", p.getFront(), "George Washington");
   
   }
   
   /**
   * Quarter getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getBackTest() {
      Quarter p = new Quarter();
      Assert.assertEquals("getBack returns incorrect Quarter back", p.getBack(), "Eagle");
   
   }
   
      
   /**
   * Quarter getStateFront test.
   * Checks constructor and getFront method
   */
   @Test public void getStateFrontTest() {
      Quarter p = new Quarter("Hawaii");
      Assert.assertEquals("getFront returns incorrect Hawaii Quarter front", p.getFront(), "George Washington");
   
   }
   
   /**
   * Quarter getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getStateBackTest() {
      Quarter p = new Quarter("Hawaii");
      Assert.assertEquals("getBack returns incorrect Hawaii Quarter back", p.getBack(), "Kamehameha");
   
   }
   

}
