import java.util.Scanner;

public class GuessingGame {
  /**name three fruit then guess the names of those fruit with only the first two letters */
  public static void main(String [] args){
    String [] fruits = new String[3];
    
    for (int i = 0; i<3; i++){
      String userInput;
      // gets input from user
      Scanner scan = new Scanner(System.in);
      System.out.println("Name the fruit");
      userInput = scan.nextLine();
      fruits[i] = userInput;
      
    }
    
    for (String fruitwords:fruits){
      String fruitGuess;
      do {
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Guess what fruit I am? "+fruitwords.substring(0,2)+"\t"+fruitwords.length()+" letters");
        fruitGuess = scan1.nextLine();
        
        if (!fruitwords.equals(fruitGuess)){
          System.out.println("Try Again");
        }
      }while (!fruitwords.equals(fruitGuess));
        System.out.println("Correct");
          
      
    }
  }
}
