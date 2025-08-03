public class Methods_1 {

//method which returs value
    /*
    public static void main(String[] args) {
         int i = 5;
         int j = 2;
         int k = max(i, j);
         System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

         // Return the max of two numbers
         public static int max(int num1, int num2) {
             int result;

             if (num1 > num2) {
                 result = num1;
             } else {
                 result = num2;
             }
             return result;
         }
         */


    // void method
public static void main(String[] args) {
     System.out.print("The grade is ");
     printGrade(78.5);

     System.out.print("The grade is ");
     printGrade(59.5);
     }

          public static void printGrade(double score) {
         if (score >= 90.0) {
             System.out.println('A');
             }
         else if (score >= 80.0) {
             System.out.println('B');
             }
         else if (score >= 70.0) {
             System.out.println('C');
             }
         else if (score >= 60.0) {
             System.out.println('D');
             }
         else {
             System.out.println('F');
             }
         }
}
