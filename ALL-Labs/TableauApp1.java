
 package week05;

/**
 * Skeleton code for an array based implementation of Young's tableau.
 *
 * @author Hugo A
 */
public class TableauApp1 {

    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        System.out.println(TableauApp1.toString(valid));
        // System.out.println(TableauApp.rowLengthDecrease(valid));
        System.out.println(TableauApp1.rowValuesIncrease(valid));
        System.out.println(TableauApp1.columnValuesIncrease(valid));
    }

    /**
     * Determines whether the array passed to it is a valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
        if(rowLengthsDecrease(t)){
            if(rowValuesIncrease(t)){
                if(columnValuesIncrease(t)){
                    if(isSetOf1toN(t)){
                        return true;
                    }
                }
            }
        }
        return false;
    }    /**
     *  Returns a string representation of an array based tableau.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a string representation of an array based tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static boolean rowLengthDecrease(int[][] t) {
        int rowLength = t[0].length;
        for (int i = 0; i < t.length; i++){
            if (t[i].length >  rowLength){
                return false;
            }
            rowLength = t[i].length; 
        }
        return true; 
    }

    public static boolean rowValuesIncrease(int[][] t){
        int rowValues = t[0][0];
        for (int row = 0; row < t.length; row++){
            for (int col = 0; col < t[row].length; col++){
                if (rowValues > t[row][col]){
                    return false;
                }
                rowValues = t[row][col];
            }
            rowValues = t[row][0];
        }
        return true;
    }

    public static boolean columnValuesIncrease(int[][] t){
        for (int col = 0; col < t[0].length; col ++){
            for (int row = 0; row < t.length-1; row++){
                if (col < t[row].length && col<t[row+1].length){
                    if (t[row+1][col] < t[row][col]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
