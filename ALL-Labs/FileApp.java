import javax.swing.*;

public class FileApp{
  
  /**Creates a JFrame object and adds instance of FilePanel to it*/
  public static void main(String[]args){
    JFrame fileFrame = new JFrame();
    fileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fileFrame.getContentPane().add(new FilePanel());
    fileFrame.pack();
    fileFrame.setVisible(true);
    fileFrame.setTitle("File Reading Lab 20");
  }
  
}