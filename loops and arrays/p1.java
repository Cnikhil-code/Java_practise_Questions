// For loop and while loop

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int product = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int a = sc.nextInt();

        // For loop
        for (int i = 1; i <= 10; i++) {
            product = a * i;
            System.out.println(a + " x " + i + " = " + product);
        }

        System.out.println("\n");

        // While loop
        int i = 1;
        while (i <= 10) {
            product = a * i;
            System.out.println(a + " x " + i + " = " + product);
            i++;
        }

        sc.close();
    }
}
