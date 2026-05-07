public class Factorial {

    // Method to calculate factorial
    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to display the factorial of a given number
    public void display(int n) {
        try {
            long factorial = calculate(n);
            System.out.println("Factorial of " + n + " = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        factorial.display(5);
    }
}
