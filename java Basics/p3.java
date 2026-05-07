import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        int product = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            product = a * i;
            System.out.println(a + " x " + i + " = " + product);
        }

        sc.close();
    }
}
 