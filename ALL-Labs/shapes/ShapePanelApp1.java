//get swirl.java
//comment heaps


package shapes; 

import javax.swing.*;
/**
 * ShapePanelApp.java 
 * Lab 21
 */

public class ShapePanelApp1{
  /** creates  an instance of the ShapePanel class, puts it on a frame and sets some essential parameters.*/
  public static void main(String[]args){
    JFrame frame = new JFrame("ShapePanel"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ShapePanel shapepanel1 = new ShapePanel();
    frame.getContentPane().add(shapepanel1);
    frame.pack();
    frame.setVisible(true);
  }
}
