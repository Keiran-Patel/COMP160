import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2020 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white); //background color is white

  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      final int MID = 150;
      final int TOP = 110;
             


      /**your pie chart code goes here - you MUST use local variables as described in the lab book*/
      
        page.setColor (Color.orange); //color of sectors
        page.fillArc (MID-65, TOP-80, 150, 150, 0, 45); // 1st arc  int x, int y, int width, int height, int start angle, int arc angle 
        
        page.setColor (Color.yellow);
        page.fillArc (MID-75, TOP-75, 150, 150, 45, 45); // 2nd arc  360/8=45     at the start angle is hwere the next color starts 
        
        page.setColor (Color.blue);
        page.fillArc (MID-75, TOP-75, 150, 150, 90, 45); // 3rd arc
        
        page.setColor (Color.green);
        page.fillArc (MID-75, TOP-75, 150, 150, 135, 45); // 4th arc
        
        page.setColor (Color.black);
        page.fillArc (MID-75, TOP-75, 150, 150, 180, 45); // 5th arc
        
        page.setColor (Color.orange);
        page.fillArc (MID-75, TOP-75, 150, 150, 225, 45); // 6th arc
        
        page.setColor (Color.pink);
        page.fillArc (MID-75, TOP-75, 150, 150, 270, 45); // 7th arc
        
        page.setColor (Color.yellow);
        page.fillArc (MID-75, TOP-75, 150, 150, 315, 45); // 8th arc
        
        page.drawRect(10, 60, 100, 10); 
        page.drawOval(10, 80, 20, 20); 
        page.drawRect(10,10,60,40);

        
    }
}
    