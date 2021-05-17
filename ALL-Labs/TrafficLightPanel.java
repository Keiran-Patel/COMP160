import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLightPanel extends JPanel {
  //private data variables
  private JButton red, amber, green;
  private JLabel labelButton, labelPressed;
  private JPanel buttonPanel;
  
  /** Constructor: Sets up the GUI */
  public TrafficLightPanel(){
    red   = new JButton("Red");
    amber = new JButton("Amber");
    green = new JButton("Green");
    
    LightPanel lightPanel = new LightPanel();
    
    ButtonListener listener = new ButtonListener();
    red.addActionListener(listener);
    amber.addActionListener(listener);
    green.addActionListener(listener);
    
    labelButton = new JLabel("Button Panel");
    labelPressed= new JLabel("last pressed");
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(80, 290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(labelButton);
    buttonPanel.add(red);
    buttonPanel.add(amber);
    buttonPanel.add(green);
    buttonPanel.add(labelPressed);
    
    setPreferredSize(new Dimension(200, 300));
    setBackground(Color.blue);
    add(buttonPanel);
    add(lightPanel);
    
    
  }
  /** buttonListener class which implements ActionaListener and has an actionPerformed method */
  private class ButtonListener implements ActionListener{
    
    /** changes the colour of the buttonPanel determinded by the button pressed*/
    public void actionPerformed (ActionEvent event){
      
      if (event.getSource() == red){
        
        labelPressed.setText("Red");
        //buttonPanel.setBackground(Color.red);
        
      }else if (event.getSource() == amber){
        
        labelPressed.setText("Amber");
        //buttonPanel.setBackground(Color.orange);
        
      }else{
        
        labelPressed.setText("Green");
        //buttonPanel.setBackground(Color.green);
      }
      repaint();
    }

  }//end buttonlistener
  
  private class LightPanel extends JPanel {
    public LightPanel(){
    setPreferredSize(new Dimension(80, 290));
    setBackground(Color.cyan);
    }
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      page.setColor (Color.black);
      page.fillOval (20, 30, 40, 40);
      page.fillOval (20, 80, 40, 40);
      page.fillOval (20, 130, 40, 40);
      
      if (labelPressed.getText().equals("Red")) {
      page.setColor (Color.red);
      page.fillOval (20, 30, 40, 40);
      }else if (labelPressed.getText().equals("Amber")){
      page.setColor (Color.orange);
      page.fillOval (20, 80, 40, 40);
      }else if (labelPressed.getText().equals("Green")){
      page.setColor (Color.green);
      page.fillOval (20, 130, 40, 40);
      }
      
    }
  }
  
  
}