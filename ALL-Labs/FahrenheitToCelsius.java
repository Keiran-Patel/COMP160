import java.util.Scanner;


/**Lab 4 COMP160 2020
 * Starting code*/
public class FahrenheitToCelsius{
  public static void main(String[]args){
    convertFToC();
    convertFToC();//* used to add 3 return functions in shell*/
    convertFToC();

    
    //Step 5;
  }

  /**gets input from user representing fahrenheit and displays celsius equivalent*/
  public static void convertFToC(){
    Scanner scan = new Scanner(System.in);//* used to get input from user as int, float*/
    System.out.println("Enter Fahrenheit temperature");
    double fahrenheit = scan.nextDouble(); //Step 2 - assign next double input from Scanner object
    System.out.println(fahrenheit + " degrees Fahrenheit is "+ toCelsius(fahrenheit) + " degrees Celsius"); //Step 4 used to add teh functions and strings together
  }


  /**calculates and returns the celsius equivalent of a double input parameter called fahr*/
  public static double toCelsius(double fahr){
    int BASE = 32;
    double CONVERSION_FACTOR = 9.0/ 5.0; //*Used for the conversion factor*/
    double celsius = (fahr-BASE)/CONVERSION_FACTOR; //*Used for the conversion factor*/
    //Step 3
    return celsius;//*used to return the function as no print funtion/*
  }
}


