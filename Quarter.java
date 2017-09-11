/**
* Quarter Coin Subclass
* @author Lisa Miller
* @since 9/9/2017
*/
public class Quarter extends Coin {

  public Quarter(){
    super(.25,"quarter");
  }
  
    //required by Coin abstract class
  public String getBack(){
    return "eagle";
  }
}
