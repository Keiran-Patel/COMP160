public class IntCounter {

  private int[] numArray;
  
  /** int counter constuctor that takes an int array*/
  public IntCounter(int[] array){
    
    numArray = array;
    
    for (int element: numArray){
      System.out.print(element+" ");
    }//end foreach this is to put a space between numbers in the script
    
    System.out.print("Array is of length "+numArray.length);
    System.out.println();
  }//end IntCounter
  
  /**prints where the position of 'target' is */
  public void showTarget(int target){
    for (int i = 0; i < numArray.length; i++){
      if (numArray[i] == target){
        System.out.println("There is a "+target+" in position "+i);
      }//end if
    }//end for
  }//end showTarget
}
