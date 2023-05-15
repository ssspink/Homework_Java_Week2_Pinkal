package Homework_Week2;

import java.util.Scanner;

public class Question_10

{

    public void multiplication(int x)
    {

    }
    public static void main(String args[])
    {
        Question_10 q1 = new Question_10();
        q1.multiplication(8);
        Scanner input =new Scanner(System.in);
        int x;
        int multiplication;
        System.out.print(" enter the multiplication of first numbers:  ");//using concatenation methods
        x=input.nextInt();

        multiplication =x * 1;
        multiplication =x * 2;
        multiplication =x * 3;
        multiplication =x * 4;
        multiplication =x * 5;
        multiplication =x * 6;
        multiplication =x * 7;
        multiplication =x * 8;
        multiplication =x * 9;
        multiplication =x * 10;

        System.out.println("Multiplication:  " + "8 x 1 = 8  ");
        System.out.println("Multiplication:  " + "8 x 2 =16  ");
        System.out.println("Multiplication:  " + "8 x 3= 24  ");
        System.out.println("Multiplication:  " + "8 x 4= 32  ");
        System.out.println("Multiplication:  " + "8 x 5= 40  ");
        System.out.println("Multiplication:  " + "8 x 6= 48  ");
        System.out.println("Multiplication:  " + "8 x 7= 56  ");
        System.out.println("Multiplication:  " + "8 x 8= 64  ");
        System.out.println("Multiplication:  " + "8 x 9= 72  ");
        System.out.println("Multiplication:  " + "8 x 10= 80 ");

    }


}

