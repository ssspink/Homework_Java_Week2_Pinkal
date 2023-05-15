

package Homework_Week2;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme
 */
public class Question_1 {
    int x = 10; //instance variable
    int y = 20;

    public void run() {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]) {
        Question_1 q1 = new Question_1();
        q1.run();
    }


}
