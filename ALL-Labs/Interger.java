import java.util.Scanner;
public class Interger{

public static void main(String[]args){
    /** variable declarations */
     int order = 2;
     int sum = 0;
    
     /** input from user*/
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a interger greater than 1:");
    int num = scan.nextInt();
    
    /** input must be greater then 2 */
    if (num < 2){
      System.out.println("Input value must not be less than 2");
    } else {
      
      while (order <= num){
        /** if the count is even the add it to sum */
        if (order % 2 == 0){
          sum = sum + order;
        }//end if
        order++;
      }// end while
      
      System.out.println("sum of even numbers between 2 and "+num+" inclusive is: "+sum);
  }// end if
  }
  
  
  
}
