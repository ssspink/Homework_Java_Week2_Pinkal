package Homework_Week2;

/**Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.5 Height = 8.5
 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20

 *   *
 */

public class Question_14
{
    public static void main(String[] args)
    {
        float width =5.6f;
        float height=8.5f;
        float area = (5.6f * 8.5f);
        float perimeter = (2f*(5.6f +8.5f));


        System.out.println("Area is 5.6 * 8.5" +  "="  +area );
        System.out.println("Perimeter is  2* (5.6 + 8.5)" + " =" + perimeter);

    }
}
