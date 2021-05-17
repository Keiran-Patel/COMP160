import java.util.Scanner;
public class GuessAnimal{
    static String[] animalGuessList = new String[3];
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

         String[] animalLongList = {"aadvark","ant", "beaver", "Cheetah","dingo", "elephant", "giraffe", "hippopotamus", "iguana","Jaguar","Lion","monkey"};
         for (int i = 0; i<3; i++){
      int userInput;      
 do{
System.out.println("Pick a number between 0 and " + (animalLongList.length-1)); 
userInput = scan.nextInt();
if( userInput < 0 || userInput >= animalLongList.length){
 System.out.println("not valid - try again");
}      else animalGuessList[i] = animalLongList[userInput];

} while(userInput < 0 || userInput >= animalLongList.length);
      
    }
    
    for (String animalwords:animalGuessList){
      String animalGuess;
      do {
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Guess what animal I am? "+animalwords.substring(0,2) + dash(animalwords)+"\t"+animalwords.length()+" letters");
        animalGuess = scan1.next();
        
        if (!animalwords.equals(animalGuess)){
          System.out.println("Try Again");
        }
      }while (!animalwords.equals(animalGuess));
        System.out.println("Correct");
          
      
    }
    
    
  }
// make method take string, return string of _ then number will be lenght of oringional string -2     animalwords 
    
    public static String dash(String s){
    String result= "";
    for (int i=2; i<s.length(); i++){
    result += "_ "; }
    
    return result;
     
}
   
   } 
      
  