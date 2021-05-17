/**  
 * SongApp.java
 * 
 * Lab 11, COMP160 2020
 */

/** imports */
import javax.swing.*;
import java.awt.*;

public class SongApp {
  public static void main(String[]args){
    
     /** calling constuctors and printing out toString method */
    Song song1 = new Song("While my guitar gently weeps");
    System.out.println(song1.toString());
    song1.process();
    
    Song song2 = new Song("Let it be");
    System.out.println(song2.toString());
    song2.process();
    
    Song song3 = new Song("Penny Lane");
    System.out.println(song3.toString());
    song3.process();
    
  }

}