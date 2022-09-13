import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Create a Stack of characters of your SURNAME.
        Stack<String> Surname = new Stack<>();

       Surname.push("M");
       Surname.push("O");
       Surname.push("N");
       Surname.push("N");
       Surname.push("T");
       Surname.push("E");
       Surname.push(" ");
       Surname.push("D");
       Surname.push("E");
       Surname.push(" ");
       Surname.push("R");
       Surname.push("A");
       Surname.push("M");
       Surname.push("O");
       Surname.push("S");

        //Print the Stack
        System.out.println(Surname);

        //Add a "INF214" to the stack.

       Surname.push("I");
       Surname.push("N");
       Surname.push("F");
       Surname.push("2");
       Surname.push("1");
       Surname.push("4");

        //Print the Stack.

        System.out.println(Surname);

        //Remove "INF214" and Add "CCDATRCL-INF214".
        
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();

        Surname.push("C");
        Surname.push("C");
        Surname.push("D");
        Surname.push("A");
        Surname.push("T");
        Surname.push("R");
        Surname.push("C");
        Surname.push("L");
        Surname.push("-");
        Surname.push("I");
        Surname.push("N");
        Surname.push("F");
        Surname.push("2");
        Surname.push("1");
        Surname.push("4");


        //Print the Stack
        System.out.println(Surname);

        }
}
