import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        //create a scaner
        Scanner input = new Scanner(System.in);

        //enter anual intrest rate in percentage
        System.out.println("Enter Annual Intrest rate e.g :7.25% ");
        double annualintrestrate = input.nextDouble();

        //obtain monthly intrest rate
        double monthglyintrestrate = annualintrestrate / 1200;

        //enter no. of years
        System.out.println("Enter number of years as a integer e.g: 5 ");
        int numbersofyears = input.nextInt();

        //enter loan amount
        System.out.println("Enter loan amount e.g 120000.52 ");
        double loanamount = input.nextDouble();

        //calculate payment
        double monthlypayment = loanamount * monthglyintrestrate / (1-1/Math.pow(1 + monthglyintrestrate,numbersofyears*12));

        double totalpayment = monthlypayment * numbersofyears *12 ;

        //display results
        System.out.println("The monthly payment is $" + (int)(monthlypayment * 100) / 100.0);
        System.out.println("The total payment is $:" + (int)(totalpayment * 100) / 100.0);


    }
}
