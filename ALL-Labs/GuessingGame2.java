import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String [] args){
    String [] animalGuessList = new String[3];
    
    for (int i = 0; i<3; i++){
      String userInput;
      // gets input from user
      Scanner scan = new Scanner(System.in);
      System.out.println("Number please");
      userInput = scan.nextLine();
      animalGuessList[i] = userInput;
      
    }
    
    for (String animalwords:animalGuessList){
      String animalGuess;
      do {
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Guess what animal I am? "+animalwords.substring(0,2)+"\t"+animalwords.length()+" letters");
        animalGuess = scan1.nextLine();
        
        if (!animalwords.equals(animalGuess)){
          System.out.println("Try Again");
        }
      }while (!animalwords.equals(animalGuess));
        System.out.println("Correct");
          
      
    }
  }
}
