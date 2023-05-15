package Homework_Week2;

import java.util.Scanner;

/**Write a program to calculate the area of a triangle.*
 *
 */
public class Question_8
{
    public static void cal()
    {
        System.out.println("Enter the value");
    }
    public static void triangle( )
    {
        int a;
        int b;
        Scanner input =new Scanner(System.in);
        int f = input.nextInt();
        int l = input.nextInt();
        int c =(f*l)/2;
        System.out.println("The calculation is: " + c);
    }
    public static void main(String[] args)
    {
        cal();
        triangle();
    }

}
