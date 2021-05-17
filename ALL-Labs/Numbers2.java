public class Numbers2 { 
public static void main(String [ ] args) {
int[] numbers = {-1, 0,-2, 1, 2};
      int consonants = 0;
      int vowels = 0;
      for(int c : numbers){ 
         switch(c){ 
            case 1:

            case 'e':
            case 'i':
            case 'o':
            case 'u':
           default: // Else
               consonants++;
         }
      }
