import java.util.*;

public class AnagramsApp {
	public static void main(String[] args) {
		
			process("Resistance", "Ancestries");
			process("Gainly", "Laying");
			process("Admirer", "Married");
			process("Orchestra", "Carthorse");
			process("Creative", "Reactive");
			process("Deductions", "Discounted");
         process("Listen", "Silent");
			process("Paternal", "Parental");
			process("Angered", "Angered");
			process("A highwayman", "Away! Hang him!");
			process("Internal Revenue Service", "I never return even a slice.");
			process("Shakespeare", "Seek a phrase.");
			process("cat", "dog.");
		
				
	}
	
	/**it takes two strings and compare them, then return a boolean value to indicate they are anagram of each other or not*/
	private static void process(String str1, String str2) {
		String sorted1 = sortString(str1);
		String sorted2 = sortString(str2);
		
		if (sorted1.equals(sorted2)) {
			System.out.println(str1 + "\t is an anagram of \t" + str2);
		
		} else {
			System.out.println(str1 + "\t is not an anagram of \t" + str2);
					}
	}
	
	/**it takes a string and sorts it based on the rule, then return the sorted string*/
	private static String sortString(String str) {
		String lowerStr = str.toLowerCase();
		String empty = "";
		for (char c = 'a'; c<='z'; c++) {
			for (int j=0; j<lowerStr.length(); j++) {
				if (lowerStr.charAt(j) == c){
           
					empty += c;
				}
			}
		}
		//System.out.println(empty + " are the letters of " + str + " in order");
		return empty;
	}
}
