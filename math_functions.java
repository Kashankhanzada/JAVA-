import java.util.Scanner;

public class math_functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double a = input.nextDouble();
        System.out.println("Enter second number : ");
        double b = input.nextDouble();

        System.out.println("Square roots of numbers: ");
        System.out.println("root of no. 1 is : " + Math.sqrt(a));
        System.out.println("root of no. 2 is : " + Math.sqrt(b));

        System.out.println("ceil of numbers :");
        System.out.println("ceil of no. 1 is : " + Math.ceil(a));
        System.out.println("ceil of no. 2 is : " + Math.ceil(b));

        System.out.println("floor of numbers :");
        System.out.println("floor of no. 1 is : " + Math.floor(a));
        System.out.println("floor of no. 2 is : " + Math.floor(b));

        System.out.println("Round off");
        System.out.println("Round off of no. 1 is : " + Math.round(a));
        System.out.println("Round off of no. 2 is : " + Math.round(b));

        System.out.println("Minimum and maximum");
        System.out.println("Maximum number between number 1 and number 2 is : " + Math.max(a,b));
        System.out.println("Minimum number between number 1 and number 2 is : " + Math.min(a,b));

        System.out.println("Generating random number :");
        System.out.println("random no. is :" + Math.random()*10);


    }
}
