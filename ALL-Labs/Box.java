/**  
 * Box.java
 * Lab 7, COMP160  2020
 * Calculating the volume and the surface area of box 
 */
public class Box { 
  
//data field declarations 
  private int length;       // height 
  private int width;       // width    
  private int height;       // length
  private int name;         //owners name  
  
  /**replacement of default condtructors*/
  public Box(){}
  
 /** constructor to set the height width and length */
  public Box(int h, int l, int w){
    height = h;
    length = l;
    width = w;
  }//end method 
  
  /** constructor sets height width and length */
  public Box(int h){
    height = h;
    length = h;
    width = h;
  }//end method
  
  
  /**sets the value of the data field length to input parameter value*/
  public void setLength(int l) {      
    length = l;   
  } //end method 
  
  /**sets the value of the data field height to input parameter value*/
  public void setHeight(int h) {      
    height = h;      
  } //end method  
  
  
  /**sets the value of the data field width to input parameter value*/
  public void setWidth(int w) {      
    width = w;      
  } //end method 
  
  /**Gets and returns the value of the volume data field*/ 
  public int getVolume(){
  int volume = length * width * height;
  return volume;
  } //end method
  
  /**Gets and returns the value of the data field surface area*/ 
  public int getArea(){
  int area = 2*length*width + 2*length*height + 2*width*height;
  return area;
  } //end method
 
  /**display values and calulations on the console window*/
  public String toString(){
  return("Height is: " + height +" Length is: " + length + " Width is: "+ width + " volume is: "+ getVolume() +", surface area: "+ getArea());
  
 
 
 
  
  // static method 
    static void name(){ 
        System.out.println("Owned by " + name()); 
    } 
  
    public static void main(String[] args) 
    { 
          // calling name without creating 
          // any object of class Test 
           name(); 
    } 
  
  
  } //end method
  
  }