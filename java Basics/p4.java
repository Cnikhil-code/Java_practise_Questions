import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Quadratic Equation Solver ===");
        System.out.println("Equation format: ax² + bx + c = 0");
        System.out.print("\nEnter coefficient a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0 (not a quadratic equation).");
            // return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        System.out.printf("%nEquation: %.2fx² + %.2fx + %.2f = 0%n", a, b, c);

        double discriminant = (b * b) - (4 * a * c);
        System.out.printf("Discriminant (D) = %.2f%n%n", discriminant);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Result: Two distinct real roots");
            System.out.printf("Root 1 = %.4f%n", root1);
            System.out.printf("Root 2 = %.4f%n", root2);

        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Result: Two equal real roots (repeated root)");
            System.out.printf("Root 1 = Root 2 = %.4f%n", root);

        } else {
            double realPart      = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Result: Two complex (imaginary) roots");
            System.out.printf("Root 1 = %.4f + %.4fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2 = %.4f - %.4fi%n", realPart, imaginaryPart);
        }

        scanner.close();
    }
}