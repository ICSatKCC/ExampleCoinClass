/**
* HalfDollar Coin Subclass
* @author Lisa Miller
* @since 9/9/2017
*/
public class HalfDollar extends Coin {

  public HalfDollar(){
    super(.50,"halfdollar", "Silver");
  }
  
    //required by Coin abstract class
  public String getBack(){
    return "presidential seal";
  }
}
