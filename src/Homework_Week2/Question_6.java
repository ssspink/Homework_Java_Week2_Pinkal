package Homework_Week2;

import java.util.Scanner;

/**
 *Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)*
 *
 */
public class Question_6
{
    public static void entNum()
    {
        System.out.println("enter the radius value");

    }
    public static void radiusNum(double r)
    {
        double ans =Math .PI * r * r;
        System.out.println("The area of the circle is: " +ans);
    }
    public static void main(String[] args)
    {

        entNum();
        Scanner input=  new Scanner(System.in);
        double r =input.nextDouble();
        radiusNum(r);
    }
}
