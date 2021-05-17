   package week02;
   
   import java.util.Random;
   /** Creates a series of coin tosses.
       @author Keiran
       */
   
   
   public class Coins{
   
       public static final boolean HEADS = true;// true boolean == hEADS 
       public static final boolean TAILS = false;//false boolean == tails
   
       private boolean[] coins;
       /** Constructs coins object from the input.
        @param coins is an array of coin tossed as a booleans)
    */
   
       public Coins(boolean[] coins) {//counts the tot heads 
           this.coins = coins;
       }
    
    public static void main(String []args) {
    boolean[] b = {HEADS, TAILS, HEADS, HEADS, TAILS};//testing the code to see if it will pass through and work
     Coins c = new Coins(b); 
     System.out.println(c.toString());
   }
      public Coins(String c){
        coins = new boolean[c.length()]; 
        for(int i = 0; i <c.length(); i++){
            char ch = c.charAt(i);
            if (ch=='H'){ // convert char to boolean 
                coins[i] = true;
            } else {
                coins[i] = false;
            }
        }
    }

    /**Method that adds 1 to c for obj in array,
           then returns the count of Heads.
          **/
    public int countHeads(){
           int c = 0;
           for(int i=0; i<coins.length; i++){
               if (coins[i]){
                   c++;
               }
           }
           return c;
       }
       /**Method that makes an empty sring and then replaces the empty string with H for heads and T for tails,
           then returns the output.
          **/

       public String toString(){
           String out ="";
           for(int i=0;i<coins.length;i++){
               if(coins[i]){
                   out+="H";
               } else{
                   out+="T";
               }
           }
           return out;
    
      }
   
   public Coins(int length){
        coins = new boolean[length];
        Random rand = new Random();
        for (int a=0;a<coins.length;a++){
            coins[a]=rand.nextBoolean(); //coins[a]==random boolean
        }
    }
    
    public int countRuns(){
        int countRuns2 = 1;
        for(int i = 1; i < this.coins.length; i++){
            if(coins[i] != coins[i-1]){ // check char is the same as last one
                countRuns2++; // when run finishes counts the total runs
            }
        }
        return countRuns2;
   }
   }
   
   