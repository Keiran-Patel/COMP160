import javax.swing.*;
import java.awt.*;



public class BookShopApp {
  
  
  public static void main(String[]args){ // mutator 
    Book b1 = new Book();
       b1.setTitle("Good Omens");
       b1.setPages(230);
       b1.setPrice(28.99);
       b1.displayBook();
       
   Book b2 = new Book();
       b2.setTitle("The Whale Rider");
       b2.setPages(120);
       b2.setPrice(19.99);
       b2.displayBook();
   
   Book b3 = new Book();
       b3.setTitle("Cherub");
       b3.setPages(340);
       b3.setPrice(26.50);
       b3.displayBook();
  }
  
}//end class