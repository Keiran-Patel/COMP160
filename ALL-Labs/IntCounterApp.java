import java.util.Scanner;
import java.util.Random;


public class IntCounterApp{
  
  /** contains a loop which ask user to specify the 'target' */
  public static void main(String[]args){
    
    
    for (int i = 0; i < 3; i ++){ //exucutes 3 times 
      int userInput;
      // gets input from user
      Scanner scan = new Scanner(System.in);
      System.out.println("Which number do you wish to find?");
      userInput = scan.nextInt();
      System.out.println(userInput);
      IntCounter counter = new IntCounter(makeArray());
      counter.showTarget(userInput);
      
    }
  }
  /** Makes the array between 5 and 10 */
  public static int[] makeArray(){
    int limit, number2;
    Random rand1 = new Random();
    limit = rand1.nextInt(6)+5;
    int [] array = new int[limit] ;
    
    for (int i = 0; i < limit; i ++){
      Random rand2 = new Random();
      number2 = rand2.nextInt(5);
      array[i] = number2;
    }//end for
    return array;
  }//end MakeArray
}