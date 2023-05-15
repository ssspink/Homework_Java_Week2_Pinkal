package Homework_Week2;

import java.util.Scanner;

/**Write a Java program to swap two variables.
 *
 *
 */
public class Question_15
{

    public static void swap()
    {
        System.out.println("Enter the first number");
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b= input.nextInt();
        int f= a;
        int e=b;
        int t=f;

        System.out.println("The first number is : "+e);
        System.out.println("The second number: "+t);
    }
    public static void main(String[] args)
    {
       swap();
    }
}
