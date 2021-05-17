public class Average1{
public static void main(String[] args){
         
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    
    for (int row = 0; row<table.length; row ++){
      // create sum
      double sum = 0;
      for (int col = 0; col <table[row].length; col ++){
        System.out.print(table[row][col]+" ");
        // add to s um
        sum = sum + table[row][col];
      }
      // compute and print average
      System.out.println("    Average : "+(sum/(table[row].length)));
      System.out.println();
    }
  }
}