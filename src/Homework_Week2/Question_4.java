package Homework_Week2;

/**4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme
 *
 */
public class Question_4
{
    int x =10;
    int y=20;
    static int a=20;
    static int b=20;

    public void a()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
    public static void b()
    {
        Question_4 q4 =new Question_4();
        System.out.println(q4.x);
        System.out.println(q4.y);
        System.out.println(a);
        System.out.println(b);


    }
    public static void main(String args[])
    {
        Question_4 q4 =new Question_4();
        System.out.println(q4.a);
        b();
    }

}
