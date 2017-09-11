/**
* Abstract class for objects that have money properties.
* @author Lisa Miller
* @since  9/7/2017
*/

public abstract class Money {
  
  //abstract class can have instance variables/data fields
  protected double value;
  protected String name;
  protected String color;
  //methods can be defined or abstract
  //get methods
  public double getValue() {
    return this.value; 
  }
  //these have to be implemented by subclasses
  public abstract String getName();  
  public abstract String getColor();  
 

}