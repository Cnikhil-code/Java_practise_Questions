public class StudentArray {

    public static void main(String[] args) {

        // Array for Student names
        String[] names = {
            "Aman", "Rohit", "Priya", "Neha", "Karan",
            "Simran", "Arjun", "Pooja", "Rahul", "Anjali"
        };

        // Array for roll numbers
        int[] rollNo = {
            101, 102, 103, 104, 105,
            106, 107, 108, 109, 110
        };

        try {

            // Intentionally using <= to generate exception
            for (int i = 0; i <= 10; i++) {

                System.out.println(
                    "Roll No: " + rollNo[i] +
                    " | Name: " + names[i]
                );
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index is out of bounds.");
            System.out.println("Program handled the exception successfully.");
        }

        System.out.println("Program continues without illegal termination.");
    }
}