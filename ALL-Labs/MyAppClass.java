import javax.swing.JFrame; import javax.swing.WindowConstants;
public class MyAppClass {
public static void main(String [ ] args) { // Steps:
JFrame frame = new JFrame("Push Counter"); // 1 make frame / window
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 2 define close behaviour 
frame.getContentPane().add( new MySupportPanel() ); // 3 add support panel *
frame.pack(); // 4 auto size the frame 
frame.setVisible(true);
}}