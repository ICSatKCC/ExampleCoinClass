/**
* Money Bill abstract super class.
* @author Lisa Miller
* @since 9/9/2017
*/

public abstract class Bill extends Money{
  protected int serialNum;
  
  /** 
  * Two parameter constructor
  * CANNOT BE INSTANTIATED BY ITSELF
  * @param v the bill value
  * @param n the bill type name
  */
  public Bill (double v, String n, int s) {
    this.value = v;
    this.name = n;
    this.serialNum = s;
    this.color = "green";
  }
  
  public int getSerialNum(){
    return this.serialNum;
  
  }
  
  public String getColor(){
    return this.color;
  }
  
  public String getName(){
    return this.name + "dollar bill";
  
  }
}