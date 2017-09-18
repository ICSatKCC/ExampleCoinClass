/**
* Dime Coin Subclass
* @author Lisa Miller
* @since 9/9/2017
*/
public class Dime extends Coin {

  public Dime(){
    super(.10,"dime", "silver");
  }
  //required by Coin abstract class
  public String getBack(){
    return "torch";
  }
}
