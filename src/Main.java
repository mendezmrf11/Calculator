import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to your calculator!");
        boolean stop = false;

        while (stop == false) {
            System.out.println("Choose the number of your operation: \n" +
                    "1. Add \n" + "2. Subtract \n" + "3. Multiply \n" + "4. Divide \n" + "5. Stop \n");

            int number = Integer.parseInt(scan.nextLine());
            double num1 = 0;
            double num2 = 0;
            Operation operation = new Operation();

            switch (number){
                case 1:
                    System.out.println("Input the first summand");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Input the second summand");
                    num2 = Double.parseDouble(scan.nextLine());
                    operation.Add(num1, num2);
                    break;

                case 2:
                    System.out.println("Input the minuend");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Input the subtrahend");
                    num2 = Double.parseDouble(scan.nextLine());
                    operation.Subtract(num1, num2);
                    break;

                case 3:
                    System.out.println("Input the first multiplication factor");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Input the first multiplication factor");
                    num2 = Double.parseDouble(scan.nextLine());
                    operation.Multiply(num1, num2);
                    break;

                case 4:
                    System.out.println("Input the dividend");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Input the divider");
                    num2 = Double.parseDouble(scan.nextLine());
                    operation.Divide(num1, num2);
                    break;

                case 5:
                    stop = true;
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Please, input a valid option");
                    break;
            }
        }
    }
}