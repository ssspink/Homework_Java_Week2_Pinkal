package Homework_Week2;

/**Input first binary number: 10
 Input second binary number: 11
 Expected Output:
 Sum of two binary numbers: 101
 *
 */
public class Question_16
{
    public static void f()
    {
        int fbn=0b10;
        int sbn=0b11;
        int sum= (fbn+sbn);
        System.out.println("The Sum of binary numbers:" + Integer.toBinaryString(sum));
    }
    public static void main(String[] args)
    {
        f();
    }
}
