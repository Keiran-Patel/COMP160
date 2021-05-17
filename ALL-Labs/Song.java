      /**  
       * Song.java
       * 
       * Lab 11, COMP160 2020
       */
      
      public class Song{
      /** data field declaration*/
      private String songLine;
      
      /** constructor sets songLine */
      public Song(String sLine){ 
      songLine = sLine;
      }//end  method
      
      /**displays and returns information to the console window */  
      public String toString(){
      return("the song line is: "+songLine); 
      } //end method
      
      
      public void process(){ 
      /**  declarations of variables*/
          int firstSpace;
          int secondSpace;
          
          /** finding the spaces */
          firstSpace = songLine.indexOf(" ", 0);
          secondSpace = songLine.indexOf(" ", firstSpace + 1);
          
            
          System.out.println("Length is: "+songLine.length()); // print the length of the string
          System.out.println("last char is: "+songLine.charAt(songLine.length() - 1 )); //print the last character
                  
          /** checks if their is a second space. */
          if (secondSpace == -1){
            System.out.println("there is not enough words to undertake these actions");
          } else {
            System.out.println("first two words: "+songLine.substring(0,secondSpace)); //print the first two words
            System.out.println("remaining words: "+songLine.substring(secondSpace + 1, songLine.length())); //prints the remaining words
            System.out.println("first letter of the third word is: "+songLine.charAt(secondSpace + 1)); // prints the first letter of the third word
          }
          
          
          System.out.println("in uppercase: "+songLine.toUpperCase()); //prints the string in uppercase
          System.out.println("replace spaces with _ : "+songLine.replace(' ', '_')); // replaces the spaces with "_"
          if (songLine.indexOf('k') == -1){
         System.out.println("char 'k' is not in song line");
         }else {
         System.out.println("the string index of k: "+songLine.indexOf('k')); //prints the string index of 'k'
          }
          System.out.println("----------------------------------------------------");
          
        
        }//end method
        
      }