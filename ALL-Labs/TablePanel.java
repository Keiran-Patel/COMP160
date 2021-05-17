// import graphics classes including JFrame
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;


public class TablePanel extends JPanel {

private Diner diner1;
private Diner diner2;
private Diner diner3;
private Diner diner4;
private Diner diner5;
private Diner diner6;

  /** creates all the poeple sitting around the table */

public TablePanel(){
diner1 = new Diner (120, 40, "Yoda", 1 );
diner2 = new Diner (180, 100, "Luke", 2 );
diner3 = new Diner (180, 160, "Han" , 3 );
diner4 = new Diner (120, 210, "Darth", 4 );
diner5 = new Diner (60, 160, "Leia", 5 );
diner6 = new Diner (60, 100, "Chewy", 6 );

setPreferredSize (new Dimension(300,400));
  setBackground (Color.yellow);
  }

public void paintComponent (Graphics g){

 super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.setColor(Color.black);
    g.fillRect(120,100,50,100);
  
  }
}






