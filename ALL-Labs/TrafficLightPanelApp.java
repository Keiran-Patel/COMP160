import javax.swing.JFrame;

public class TrafficLightPanelApp {
  
  public static void main(String[]args){
    //  Creates and presents the program frame.
    JFrame frame = new JFrame ("Traffic Lights");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new TrafficLightPanel());
    
    frame.pack();
    frame.setVisible(true);
    
  }

  }
  
  // creates j frame, gives a tittle 
  // always the same for all frames and windows thena,e TrafficLightPanel changes tho,