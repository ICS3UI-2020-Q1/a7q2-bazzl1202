/**
 * A method that takes an integer and tells the user its factors
 * @author Liana Bazzarella
 */
public class Main {

 // a method that takes an integer and tells the user its factors
  public static void factors(int integer){
   for(int i = 1; i <= integer; i++){
     if(integer%i == 0){
       System.out.println(i);
     }
   }
 }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // prints the factors out to the user
    factors(30);
  }
}