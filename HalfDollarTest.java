import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* HalfDollarTest - a JUnit test for HalfDollar.java.
* @author Lisa Miller
* @since 1/24/22
*/

public class HalfDollarTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * HalfDollar getNameTest.
   * Checks constructor and getName method
   */
   @Test public void getNameTest() {
      HalfDollar p = new HalfDollar();
      Assert.assertEquals("GetName returns incorrect name.", "Half Dollar", 
          p.getName());
   
   }

   /**
   * HalfDollar getValue test.
   * Checks constructor and getValue method
   */
   @Test public void getValueTest() {
      HalfDollar p = new HalfDollar();
      Assert.assertEquals("getValue returns incorrect HalfDollar value", .50, p.getValue(), .001);
   
   }
   
   /**
   * HalfDollar getColor test.
   * Checks constructor and getColor method
   */
   @Test public void getColorTest() {
      HalfDollar p = new HalfDollar();
      Assert.assertEquals("getColor returns incorrect HalfDollar color", p.getColor(), "Silver");
   
   }
   
   /**
   * HalfDollar getFront test.
   * Checks constructor and getFront method
   */
   @Test public void getFrontTest() {
      HalfDollar p = new HalfDollar();
      Assert.assertEquals("getFront returns incorrect HalfDollar front", p.getFront(), "John F. Kennedy");
   
   }
   
   /**
   * HalfDollar getBack test.
   * Checks constructor and getFront method
   */
   @Test public void getBackTest() {
      HalfDollar p = new HalfDollar();
      Assert.assertEquals("getBack returns incorrect HalfDollar back", p.getBack(), "Presidential Coat of Arms");
   
   }
   
   

}
