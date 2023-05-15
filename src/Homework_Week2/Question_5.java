package Homework_Week2;
/**Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.
 * * *
 */
import java.util.Scanner;

public class Question_5 {
    public static void addition(int x, int y)
    {
        int result = x+y;
        System.out.println("Addition of two number " + x+ " and " +y + " is"  + result);
    }
    public static void subtraction(int x, int y)
    {
        int result = x -y;
        System.out.println("Subtraction of two number " + x+ " and " +y + " is"  + result);
    }

    public void multiplication(int x, int y)
    {
        int result = x * y;
        System.out.println("Multiplication of two number " + x+ " and " +y + " is"  + result);
    }

    public void division(int x, int y)
    {
        int result = x/y;
        System.out.println("division of two number " + x+ " and " +y + " is"  + result);
    }

    public static void enterTwoNumbers()
    {

    }
    public static void main(String[] args) {
        enterTwoNumbers();
        Scanner sr =new Scanner(System.in);
        int x =(int)sr.nextDouble();
        int y= (int)sr.nextDouble();

        Question_5 q1 = new Question_5(); //calling non static methods

        q1.multiplication(x, y);
        q1.division(x,y);
        addition(x,y);
        subtraction(x,y);



    }
}
