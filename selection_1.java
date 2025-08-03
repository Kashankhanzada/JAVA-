import java.util.Scanner;

public class selection_1 {
    public static void main(String[] args) {
        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number = num1 + num2;

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + num1 + " + " + num2 + " =  ?");
        int answer = input.nextInt();

        if(number == answer){
            System.out.println(num1 + " + " + num2 + " = " + answer);
            System.out.println("The answer is true");
        }
        else {
            System.out.println(num1 + " + " + num2 + " = " + answer + " is incorrect answer");
            System.out.println("The correct answer is : " + number);
        }

    }
}
