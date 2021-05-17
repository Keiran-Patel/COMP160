/** FilePanel.java
  * Lab 20, COMP160,  2020
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    //data variables
    String fileName = "LongBadData.txt";
    Boolean fillRect;
    Color c;
    try{
      
      Scanner fileScan = new Scanner(new File( fileName)); //creates new scanner object
      
      
      while (fileScan.hasNextLine() && (count < drawObjects.length)){
        
        String inputLine = fileScan.nextLine();
        Scanner inputLineScan = new Scanner(inputLine);
        
        if (inputLine.matches("\\d+ [1-3] \\d+ \\d+ \\d+ \\d+")){//checks if there is 6 digits 
          int fill = inputLineScan.nextInt();
          int colour = inputLineScan.nextInt();
          int x = inputLineScan.nextInt();
          int y = inputLineScan.nextInt();
          int width = inputLineScan.nextInt();
          int height = inputLineScan.nextInt(); 
          
          
          //determines if rectangle should be filled or not
          if (fill == 1){
            fillRect = true;
          }else {
            fillRect = false;
          }
          
          if (colour == 1 ){
            c = Color.red;
          }else if (colour == 2){
            c = Color.blue;
          }else{
            c = Color.green;
          }
          drawObjects[count] = new Rectangle(fillRect,c, x, y,width,height);
          count++;
          
        }
        
      }//while
    }catch (FileNotFoundException e){
      System.out.println("File Not found. Check file name and location");
      System.exit(1); //exit from program if no file to read
    }
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
