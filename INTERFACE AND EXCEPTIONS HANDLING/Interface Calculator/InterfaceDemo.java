//Interface
interface Calculator {

    // Abstract method
    void addition(int a, int b);

    void multiplication(int a, int b);

    void division(int a, int b);
}

// Class implementing the interface
class MyCalculator implements Calculator {

    // Override addition method
    @Override
    public void addition(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // Overriding multiplication method
    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    // Overriding division method
    @Override
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        // Creating object
        MyCalculator obj = new MyCalculator();

        // Calling methods
        obj.addition(10, 5);
        obj.multiplication(10, 5);
        obj.division(10, 5);
        obj.division(10, 0);
    }
}
