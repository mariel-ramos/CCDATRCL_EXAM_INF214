
public class Char {
    public static void main(String[] args) {
       
        //Create an array of characters of your SURNAME.
        char[] SURNAME = { 'M', 'O', 'N', 'T', 'E', ' ', 'D', 'E', ' ', 'R', 'A', 'M', 'O', 'S', };

        //Print each character of your SURNAME on each line.
         for (int i = 0; i < SURNAME.length; i++) {
           System.out.println(SURNAME[i]);
        }

        //Print the first character of your SURNAME.
         System.out.println(SURNAME[0]);

        //Print the last character of your SURNAME.
         System.out.println(SURNAME[13]);

        //Print the character of your SURNAME in reverse order.
        for (int i = SURNAME.length - 1; i >= 0; i--) {
           System.out.println(SURNAME[i]);
        }
       
   }

       
   }


