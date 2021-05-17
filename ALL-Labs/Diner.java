/**represent the seat aroud the table*/
import java.awt.*;
import javax.swing.*;
import java.awt.Color.*;

public class Diner {

/** declares data values*/

private int x;
private int y;
private String name;
private int seatNum;
private Color colour;
private final int DIAMETER = 50;

/**constructor*/
public Diner(int a, int b, String n, int s){
 
this.x = a;
this.y = b;
this.name = n;
this.seatNum = s;
if (s%2==0){ 
colour = Color.blue;
}
else colour = Color.red;

    
}
  
/** draws the diner table and people */
public void draw(Graphics g){
  
    g.setColor(colour); // sets color
    g.fillOval(x, y, 50, 50);    // circle
    g.setColor(Color.black);// sets color
    g.drawString(name, x, y+30); // name
    g.setColor(Color.black);
    g.drawString(Integer.toString(seatNum), x+20, y+15);
  }//end draw
 
}//end class
  
  