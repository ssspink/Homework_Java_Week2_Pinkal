package Homework_Week2;

import java.util.Scanner;

/**
 *Write a program to convert the upper case to lower case.
 *
 */
public class Question_9 {

    public static void convert()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the uppercase" );
        char uppercase = input.next().charAt(0);
        char lowercase = Character.toLowerCase(uppercase);
        System.out.println("The lowercase equ is:" +lowercase);
    }

    public static void main(String args[])
    {
        convert();
    }

}
