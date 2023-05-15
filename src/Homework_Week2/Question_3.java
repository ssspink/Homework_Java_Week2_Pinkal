package Homework_Week2;
/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Question_3
{
    int a=10;
    static int b=10;

   public static void w()
   {
        Question_3 q =new Question_3();
        System.out.println(q.a);
        System.out.println(b);
   }
    public void m()
    {
        System.out.println(b);
        System.out.println(a);
    }
    public static void main(String args[])
    {
            Question_3 q3 =new Question_3();
            w(); //calling static method directly
            q3.m();//calling instance method by creating object

    }

}
