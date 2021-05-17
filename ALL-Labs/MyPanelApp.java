
import javax.swing.*;

public class MyPanelApp{
public static void main(String[]args){
    JFrame frame = new JFrame("MyPanel");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    MyPanel mp1 = new MyPanel();
       mp1.decorate(java.awt.Color.yellow, 180);
    MyPanel mp2 = new MyPanel();
       mp1.decorate(java.awt.Color.orange, 180);
   
  }
}

