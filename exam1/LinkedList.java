import java.util.LinkedList;


class main {
    public static void main(String[] args){
    
    
    //Create a Linked list of the last six numbers of your STUDENT NUMBER.

    LinkedList<String> studentNumber = new LinkedList<>();

    studentNumber.add("2");
    studentNumber.add("0");
    studentNumber.add("2");
    studentNumber.add("2");
    studentNumber.add("-");
    studentNumber.add("1");
    studentNumber.add("0");
    studentNumber.add("8");
    studentNumber.add("9");
    studentNumber.add("0");
    studentNumber.add("9");

    System.out.println(studentNumber);
    
    //Add an asterisk (*) to the head/front of the Linked list.
    studentNumber.addFirst("*");

    //Add an asterisk (*) to the tail/end of the Linked list.
    studentNumber.addLast("*");

    //Print the Linked list.
    System.out.println(studentNumber);

    //Print the last character of the Linked list.
    System.out.println(studentNumber.get(10));

    //Replace the last character of the Linked list with the exclamation symbol (!).
    studentNumber.set(12, "!");

       //Remove the first character of the Linked list.
       studentNumber.remove(0);

       //Print the LinkedList.
       System.out.println(studentNumber);
    }
}
