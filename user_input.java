import java.util.Scanner;

public class user_input
{
     public static void main(String[] args) {
         //System.out.println("taking input from the user");
         Scanner sc= new Scanner(System.in);//read from the keayboard scanner is the class which is used to take input
         /*System.out.println("enter number 1");
         int a = sc.nextInt();
         System.out.println("enter number 2");
         int b = sc.nextInt();
         int sum = a + b;
         System.out.println("the sum is " + sum);
         */

         //its is used to check weather the input is true or false
         //Boolean b1 = sc.hasNextInt();
         //System.out.println(b1);

         //String str = sc.next();//for one word
         //String str = sc.nextLine();//for line
         //System.out.println(str);

         //System.out.println(" enter you name");
         //String name = sc.next();
         //System.out.println("hello" + name + "have a good day");

         //check the input number is integer or not
         System.out.println("Enter your name");
         System.out.println(sc.hasNextInt());
    }

}
