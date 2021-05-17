import java.util.*;

/** An RPN calculator application for COSC241 Assignment 1
 *  @authors: 
**/
public class RPNApp{
   /** The first number to be popped off the stack in the event of basic operations **/
   private static int num1 = 0;
   /** The second number to be popped off the stack in the event of basic operations **/
   private static int num2 = 0;
   /** The result of an operation **/
   private static int result = 0;
   /** The Stack data structure **/
   private static Stack<Integer> stack = new Stack<Integer>();
   /** The line of input to be processed **/
   private static String input;
   /** The result of processing the input, as read from the Stack **/
   public static String processed;
   /** The error flag, which will be set to true if we encounter an error **/
   public static boolean error = false;
   
   //private static int repeat = 0; -- This was part of an attempt to handle input lines with brackets
   
   /** Main method
       @ param: takes no parameters
       @ return: returns no value
       The main method begins by asking the user for a line of input from System.in
       The program will not accept a line if it has unmatched parentheses.
       If the line has no parentheses or they are matched, the tokens array is created by splitting the input line on whitespace
       The tokens array is then passed to the process method, and the resulting String is printed to System.out unless we encounter an error
       If an error is encountered, we repeat the process until a line whihc can be processed is entered
       
   **/
   public static void main(String[]args){
      getInput();
      String[] tokens = new String[input.split(" ").length];
      for(int i = 0; i < tokens.length; i++){
         tokens[i] = input.split(" ")[i];
      }
      processed = process(tokens);
   
      while(processed.equals("!@!@")){
         while(stack.empty() == false){
            stack.pop();
         }
         getInput();
         tokens = new String[input.split(" ").length];
         for(int i = 0; i < tokens.length; i++){
            tokens[i] = input.split(" ")[i];
         }
      
         // Pass the tokens array to the process method and print out the result.
         processed = process(tokens);
      }
      System.out.println(processed);
      
      //while(repeat > 0){ -- This was part of an attempt to handle input lines with brackets
         // substring of original input upto but not including the number before '(', plus the number before the bracket - 1 plus substring of everything after '('
         //repeat--;
         //System.out.println(Arrays.toString(processed.split(" ")));
         //tokens = processed.split(" ");
         //processed = process(tokens);
      //}
   }
   
      
      
   /** @param: Takes an array of Strings
    *  @return: Returns a String representing the result when the input line has been processed
    *  The process method contains a loop to iterate through each token from the users' input.
    *  Each token is passed to a switch case which determines which actions to take
    *  Once all tokens have been processed, we either have encountered an error, in which case we return the error code, or we output the result of the operations if no error was encountered
    * 
   **/
   public static String process(String[] tokens){
      error = false;
      // Process each String from the tokens array
      for(int i = 0; i < tokens.length; i++){
         // Pass each String to the switch case
         switch(tokens[i]){
            case "/":
               basicOperators("/");
               break;
            case "*":
               basicOperators("*");
               break;
            case "+":
               basicOperators("+");
               break;
            case "-":
               basicOperators("-");
               break;
            case "%":
               basicOperators("%");
               break;          
            case "+!":
               repeat("+!");
               break; 
            case "-!": 
               repeat("-!");
               break; 
            case "*!":
               repeat("*!");
               break; 
            case "/!":
               repeat("/!");
               break; 
            case "%!":
               repeat("%!");
               break;
            // Duplicate case
            case "d":
               stack.push(stack.peek());
               break;
            // Output case
            case "o":
               // Printing what is at the top of the stack, with a space but no new line
               System.out.print(stack.peek() + " ");
               break; 
               
            // Copy case  
            case "c":
               // First check if stack contains at least two items
               if(stack.size() < 2){
                  error = true;
                  System.out.println("Error: Too few operands");
                  break;
               }
               
               // Then check if top item is negative
               if(stack.peek() < 0){
                  error = true;
                  System.out.println("Error: Negative copy");
                  break;
               }
                  
               // Pop top two numbers, (y and x respectively), and push y copies of x onto stack
               num1 = stack.pop();
               num2 = stack.pop();
               for(int index = 0; index < num1; index++){
                  stack.push(num2);
               }
               break;
               
            // Repeat case
            case "r":
               // Pop off top item to use as numRotations
               int numRotations = stack.pop();
            
               // First check if stack contains at least two items
               if(stack.size() < numRotations){
                  error = true;
                  System.out.println("Error: Too few operands");
                  break;
               }
               
               // Then check if top item is negative
               if(numRotations < 0){
                  error = true;
                  System.out.println("Error: Negative roll");
                  break;
               }
               
               // Rotate the new top item numRotations positions down
               stack.insertElementAt(stack.peek(), stack.size()-numRotations);
               stack.pop();
               break;
               
            case "(":
               // This was part of an attempt to handle input lines with brackets
            
               // Whatever number is at the top of the stack when we encounter a '(' is the number of times we will repeat the operation inside the brackets
               // repeat = stack.pop();
               
               // Get the operation to be performed, which is everything up to the closing bracket
               String operation = input.substring(input.indexOf("(") + 2, input.indexOf(")") - 1);
               String currentStack = stack.toString();
               currentStack = currentStack.substring(1, currentStack.length()-1);
               //System.out.println(currentStack + " " + operation);
               return currentStack + " " + operation;
               
            case ")":
               break;    
                          
            // Default case handles numbers and unrecognised tokens
            default:
               // If number, push to stack
               if(isNumber(tokens[i])){
                  
                  stack.push(Integer.parseInt(tokens[i]));
               }else{
                  System.out.println("Error: bad token '"+tokens[i]+"'");
                  error = true;
               }
         }
      }
      if(error){
         // return error code
         return "!@!@";
      }else{
         // return result
         return stack.toString();
      }
   }
   
   /** @param: takes a String representing a repeat operator
    *  @return: no return value, the method simply performs the appropriate operations on the stack
    *  The repeat method takes a String representing the repeat operation to be performed, and then performs the appropriate operation on every item in the stack
    *  Finally, the result is pushed to the stack
    * 
   **/
   public static void repeat(String prevOperator){
      int result = stack.pop();
      if(prevOperator.charAt(0) == '+'){
         while(stack.size() > 0){
            result += stack.pop();
         }
      }else if(prevOperator.charAt(0) == '-'){
         while(stack.size() > 0){
            result -= stack.pop();
         }
      }else if(prevOperator.charAt(0) == '*'){
         while(stack.size() > 0){
            result *= stack.pop();
         }
      }else if(prevOperator.charAt(0) == '/'){
         while(stack.size() > 0){
            result /= stack.pop();
         }
      }else{
         while(stack.size() > 0){
            result %= stack.pop();
         }
      }
      stack.push(result);
   }
   
   /** @param: takes a String
    *  @return: true if the String contains only digits, false otherwise
    *  The isNumber method checks if a String contains only digits by iterating over each character and checking that each character is a digit
    * 
   **/
   public static boolean isNumber(String s){
      //For each character in s
      for(int i = 0; i < s.length(); i++){
         // If it is not a number, return false
         if(Character.isDigit(s.charAt(i)) == false){
            return false;
         }
      }
      // Will return true if all characters are numbers
      return true;
   }
   
   /** @param: takes a String
    *  @return: true if the String contains unmatched brackets, false otherwise 
    *  The unMatched method iterates over each character in the String, and increments counter for an opening bracket, decrements counter for a closing bracket
    *  If at any stage counter is negative, we know the brackets are unmatched.
    *  If counter never becomes negative, we simply need to check that it is exactly 0 after the loop has finished to assert that the brackets match
   **/
   public static boolean unMatched(String s){
      int counter = 0;
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == '('){
            counter++;
         }else if(s.charAt(i) == ')'){
            counter--;
         }
         if(counter < 0){
            return true;
         }
      }
      if(counter == 0){
         return false;
      }else{
         return true;
      }
   }
   
   /** @param: takes a String representing the operation we need to perform
    *  @return: no return value, simply performs the appropriate operation on the stack
    *  The basicOperators method will first check if we have enough operands
    *  Then the method will check for division by 0
    *  If either of the above error cases occur, we set the error datafield to true and won't attempt to perform any operations
    *  If neither of the above error cases are true, we can perform the operation on the top two items of the stack
    * 
   **/
   public static void basicOperators(String operator){
      // Check that there are in fact at least 2 numbers on the stack
      if(stack.size() < 2){
         error = true;
         System.out.println("Error: Too few operands");
      }else{
      
      // Pop numbers off stack if there are at least 2
         num1 = stack.pop();
         num2 = stack.pop();
      
      // Check for diviison by 0
         if((num1 == 0 || num2 == 0) && (operator.equals("%") || operator.equals("/"))){
            error = true;
            System.out.println("Error: division by 0");
         }
      
      // Perform operator with the numbers
         if(error == false){
         
            if(operator.equals("/")){
               result = num2/num1;
            }else if(operator.equals("%")){
               result = num2%num1;
            }else if(operator.equals("*")){
               result = num1*num2;
            }else if(operator.equals("+")){
               result = num1+num2;
            }else if(operator.equals("-")){
               result = num2-num1;
            }
         // Push result onto stack
            stack.push(result);
         }
      }
   }
   
   /** @param: takes no input
    *  @return: returns no value, simply initialises the input data field if the input entered by the user doesn't contain unmatched parentheses
    *  The getInput method asks the user for a line of input, and then checks if it contains unmatched parentheses
    *  If the input line does contain unmatched parentheses, tell the user they have antered a String with unmatched parentheses and ask again until satisfactory input is entered
    * 
   **/
   public static void getInput(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the line to be processed");
      input = sc.nextLine();
      // Check for unmatched brackets
      if(unMatched(input)){
         boolean matched = false;
         while(matched == false){
            System.out.println("Error: unmatched parentheses");
            System.out.println("Enter the line to be processed");
            input = sc.nextLine();
            if(unMatched(input)){
               continue;
            }else{
               matched = true;
            }
         }
      }
   }
}