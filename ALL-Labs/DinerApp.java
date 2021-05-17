import javax.swing.JFrame;

public class DinerApp{
  public static void main(String[]args){
  JFrame frame = new JFrame ("Diner starwars");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.getContentPane() .add(new TablePanel());
  frame.pack();
  frame.setVisible(true);
  }
}