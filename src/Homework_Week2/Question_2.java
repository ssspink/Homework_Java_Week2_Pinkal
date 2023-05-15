package Homework_Week2;


/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Question_2 {
    static int x = 10;
    static int y = 10;

    public static void walk() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main() {
        walk();//calling directly
        Question_2.walk();//calling from class name

    }


}
