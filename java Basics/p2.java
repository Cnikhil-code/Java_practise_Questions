import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your address: ");
        String address = sc.nextLine();

        System.out.println("Enter your Enrolment Number: ");
        int enrolmentNumber = sc. nextInt();

        System.out.println("Enter your Mobile Number: ");
        int mobileNumber = sc.nextInt();

        // Display
        System.out.println("--- Student details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Entrolment Number: " + enrolmentNumber);
        System.out.println("Mobile Number: " + mobileNumber);

        sc.close();
    }
}
