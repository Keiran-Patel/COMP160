import java.awt.*; 
import javax.swing.*;
public class MySupportPanel extends JPanel {
public MySupportPanel() { // constructor
 JButton push = new JButton("Push Me!"); 
 JLabel label = new JLabel("Pushes: "); 
 add(push);
add(label);
setPreferredSize(new Dimension(300,40));
}}