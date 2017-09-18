/**
* Nickel Coin Subclass
* @author Lisa Miller
* @since 9/9/2017
*/
public class Nickel extends Coin {

  public Nickel(){
    super(.05,"nickel");
  }
  //required by Coin abstract class
  public String getBack(){
    return "Montecello";
  }
}
