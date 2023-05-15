package Homework_Week2;

import java.util.Scanner;

/**Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 **
 */
public class Question_13

{
    public static void aver()
    {
        System.out.println("Enter the first number:"  );
        Scanner input = new Scanner(System.in);
        double a= input.nextDouble();
        System.out.println("Enter the second number:"  );
        double b =input.nextDouble();
        System.out.println("Enter the third number:"  );
        double c= input.nextInt();
        double f=(a+b+c);
        System.out.println("The average number is:" + f );
    }


    public static void main(String args[])
    {
        aver();
    }

}
