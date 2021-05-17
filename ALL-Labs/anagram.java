import java.util.Scanner;

public class anagram {
  public static void main(String[]args){
  
  String phrase1; 
  String phrase2;
  
  phrase1 = anagram();
  phrase2 = anagram();
  
if (phrase1.equals(phrase2)){
    System.out.println("phrase's entered is an anagram");
    } else {
    System.out.println("phrase's entered is not an anagram");
    }
 }//end main
 
 public static String anagram(){
      /** variable declarations */
      String mySentance;
      String lowerSentance;
      String newString;
      
      
      /** input from user*/
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter first phrase:");
      mySentance = scan.nextLine();
      
      lowerSentance = mySentance.toLowerCase(); // gets ride of the cap form the phrase entered in
      newString = "ss";//blank string
      
      /** checks if the char is a letter. If so then passes it into the next for*/
      for(char c = 'a'; c <= 'z'; c++){
        
        /**for each index position in lowerSentance. if the char matches the letter, append it to newString */
        for(int i = 0; i < lowerSentance.length(); i++){
          
          if (lowerSentance.charAt(i) == c){
            newString = newString + c;
          }//end if
          
        }//end for
      }//end for
      System.out.println(newString+" is the letters of '"+lowerSentance+"' in order");
      System.out.println();
      return newString;
    } 
}//end public