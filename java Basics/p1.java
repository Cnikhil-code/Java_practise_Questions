import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a = ");
        a = sc.nextInt();
        System.out.print("Enter number b = ");
        b = sc.nextInt();

        // Average of the number
        System.out.println("Average of the number = " + (a + b) / 2.0);

        // Largest number
        if (a > b) {
            System.out.println(a + " is largest number");
        } else if (b > a) {
            System.out.println(b + " is largest number");
        } else {
            System.out.println("Both are equal!");
        }

        // Smallest number
        if (a < b) {
            System.out.println(a + " is largest number");
        } else if (b < a) {
            System.out.println(b + " is largest number");
        } else {
            System.out.println("Both are equal!");
        }
        sc.close();
    }
}
