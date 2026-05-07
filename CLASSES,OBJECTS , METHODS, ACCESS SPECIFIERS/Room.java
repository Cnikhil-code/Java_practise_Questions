import java.util.Scanner;

public class Room {

    // Attributes
    int room_no;
    String room_type;
    String room_ac_status;
    double room_rent;

    // Method to set/insert room data
    void setData(int room_no, String room_type, String room_ac_status, double room_rent) {
        this.room_no     = room_no;
        this.room_type   = room_type;
        this.room_ac_status = room_ac_status;
        this.room_rent   = room_rent;
    }

    // Method to display room data
    void displayData() {
        System.out.println("----------------------------------");
        System.out.println("         ROOM DETAILS             ");
        System.out.println("----------------------------------");
        System.out.println("Room Number   : " + room_no);
        System.out.println("Room Type     : " + room_type);
        System.out.println("AC Status     : " + room_ac_status);
        System.out.println("Room Rent     : Rs." + room_rent + " per night");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create multiple Room objects
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();

        // Taking input from the user for room1
        System.out.println("Enter details for Room 1:");
        System.out.print("Room Number   : ");
        int rno1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Room Type     : ");
        String rtype1 = sc.nextLine();
        System.out.print("AC Status (AC/Non-AC): ");
        String rac1 = sc.nextLine();
        System.out.print("Room Rent     : ");
        double rrent1 = sc.nextDouble();

        // Taking input from the user for room2
        System.out.println("\nEnter details for Room 2:");
        System.out.print("Room Number   : ");
        int rno2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Room Type     : ");
        String rtype2 = sc.nextLine();
        System.out.print("AC Status (AC/Non-AC): ");
        String rac2 = sc.nextLine();
        System.out.print("Room Rent     : ");
        double rrent2 = sc.nextDouble();

        // Taking input from the user for room3
        System.out.println("\nEnter details for Room 3:");
        System.out.print("Room Number   : ");
        int rno3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Room Type     : ");
        String rtype3 = sc.nextLine();
        System.out.print("AC Status (AC/Non-AC): ");
        String rac3 = sc.nextLine();
        System.out.print("Room Rent     : ");
        double rrent3 = sc.nextDouble();

        // Setting data using setData()
        room1.setData(rno1, rtype1, rac1, rrent1);
        room2.setData(rno2, rtype2, rac2, rrent2);
        room3.setData(rno3, rtype3, rac3, rrent3);

        // Displaying all room data using displayData()
        System.out.println("\n========== ALL ROOM DETAILS ==========");
        room1.displayData();
        room2.displayData();
        room3.displayData();

        sc.close();
    }
}