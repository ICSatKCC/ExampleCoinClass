/**
* Penny Coin Subclass
* @author Lisa Miller
* @since 9/9/2017
*/
public class Penny extends Coin {

  public Penny(){
    super(.01,"penny");
  }
  
  public String getColor () {
    return "Copper";
  }
  
  //required by Coin abstract class
  public String getBack(){
    return "shield";
  }

}
