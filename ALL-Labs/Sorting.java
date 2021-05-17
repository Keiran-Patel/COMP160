/** Lab 25
  * program to take an array whose elements have been inputed by the user and perform the selection sort
  */
import java.util.Scanner;
public class Sorting
{
  static int [] array = new int [10];
  public static  void main(String args[])
  { 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the elements in the array");
    for(int i=0; i<10; i++)
    {
      array[i] = scan.nextInt();
    }
     int small=0;
    for(int k=0; k<10; k++) // selection sort
    {
      int count=k;
      for(int j=k+1; j<10; j++)
      {
        if(array[j] < array[count])
          count=j;

        
        small = array[k];
        array[k] = array[count];
        array[count] = small;
      }
    }
    System.out.println("Press 1 for assending order or 2 for descending order");
    int input = scan.nextInt();
    if(input == 1)
    {
      for(int l=0; l<10; l++) // prints in ascending order
      {
        System.out.print(array[l] + " ");
      }
    }
    else if(input == 2)
    {
      for(int l=9;l>=0;l--) // prints in descending order
      {
        System.out.print(array[l] + " ");
      }
    }
      else 
        System.out.println("Invalid choice");
    }
  }