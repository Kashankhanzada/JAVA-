import java.util.Scanner;

public class Switch_1 {
    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);

        System.out.println("Enter a number for week day [1 to 7] :");
        int num = day.nextInt();

        if (num >= 1 && num <= 7) {
            switch (num){
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
            }
        } else {
            System.out.println("Incorrect Input");
        }

    }
}
