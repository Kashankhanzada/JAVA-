import java.util.Scanner;

public class Loops_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
     // while loop
        /*
        int i = 0;
        while (i < 100) {
            System.out.println("Welcome to Java!");
            i++;
        }
        */

        //do while loop
        /*
        int data;
        int sum = 0;

         // Create a Scanner


         // Keep reading data until the input is 0
         do {
             // Read the next data
             System.out.print("Enter an integer (the input ends if it is 0): ");
             data = input.nextInt();

             sum += data;
             } while (data != 0);

         System.out.println("The sum is " + sum);
         */

        //for loop
        /*
        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + count);
        */
    }


}

