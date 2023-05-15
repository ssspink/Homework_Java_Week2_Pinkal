package Homework_Week2;

import java.util.Scanner;

/**Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C) *
 *
 */
public class Question_7
{
   public static void temp()
   {
       System.out.println("Insert the number");
   }

    public static void deg(double f)
    {
       double c= ((f-32)*5/9);
        System.out.println("The temprature in calcius:" + c);
    }
    public static void main(String[] args)
    {
        temp();
        Scanner input =new Scanner(System.in);
        double f=input.nextDouble();
        deg(f);
    }
}
