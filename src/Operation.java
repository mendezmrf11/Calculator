public class Operation {

    private double num1;
    private double num2;


    public void Add(double num1, double num2)
    {
        System.out.println("The result is: " + (num1 + num2));
    }

    public void Subtract(double num1, double num2)
    {
            System.out.println("The result is: " + (num1 - num2));
    }

    public void Multiply(double num1, double num2)
    {
        System.out.println("The result is: " + (num1 * num2));
    }

    public void Divide(double num1, double num2)
    {
        if(num2 != 0)
            System.out.println("The result is: " + (num1 / num2));
        else
            System.out.println("You can't divide by zero");
    }
}
