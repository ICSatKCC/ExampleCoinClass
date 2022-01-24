/**
* Driver class for Basic Coins.
* @author Lisa Miller
* @since 1/24/22
*/
public class CoinDriver {
   
   /** main method.
   * @param args not used
   */ 
   public static void main(String[] args) {
      
      //test all the constructors
      DollarCoin c1 = new DollarCoin();
      HalfDollar c2 = new HalfDollar();
      Quarter c3 = new Quarter();
      Dime c4 = new Dime();
      Nickel c5 = new Nickel();
      Penny c6 = new Penny();
      
      //State Quarters
      Quarter s1 = new Quarter("Hawaii");
      Quarter s2 = new Quarter("California");
      
      System.out.print("The first coin is a " + c1.getName());
      System.out.print(", it is " + c1.getColor() + " colored,");
      System.out.println(" it is worth $ " + c1.getValue());
      
      System.out.print("The second coin is a " + c2.getName());
      System.out.print(", it is " + c2.getColor() + " colored,");
      System.out.println(" it is worth $ " + c2.getValue());
      
      System.out.print("The third coin is a " + c3.getName());
      System.out.print(", it is " + c3.getColor() + " colored,");
      System.out.println(" it is worth $ " + c3.getValue());
      
      System.out.print("The fourth coin is a " + c4.getName());
      System.out.print(", it is " + c4.getColor() + " colored,");
      System.out.println(" it is worth $ " + c4.getValue());
      
      System.out.print("The fifth coin is a " + c5.getName());
      System.out.print(", it is " + c5.getColor() + " colored,");
      System.out.println(" it is worth $ " + c5.getValue());
      
      System.out.print("The sixth coin is a " + c6.getName());
      System.out.print(", it is " + c6.getColor() + " colored,");
      System.out.println(" it is worth $ " + c6.getValue());
      
      
      System.out.println("\n\nThe back of a regular Quarter is: " + c3.getBack());
      System.out.println("The back of a Hawaii Quarter is: " + s1.getBack());
      System.out.println("The back of a California Quarter is: " + s2.getBack());
     
   } //close main
   

} //close class
