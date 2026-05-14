// Interface
interface Student {

    // Abstract method
    void Display_Grade();

    void ShowAttendance();
}

// Class for PG Students
class PG_Students implements Student {

    private String grade;
    private int attendance;

    // Constructor
    PG_Students(String grade, int attendance) {
        this.grade = grade;
        this.attendance = attendance;
    }

    // Overriding Display_Grade method
    @Override
    public void Display_Grade() {
        System.out.println("PG Student grade = " + grade);
    }

    // Overriding ShowAttendance method
    @Override
    public void ShowAttendance() {
        System.out.println("PG Student Atttribute = " + attendance + "%");
    }
}

// Class for UG Students
class UG_Students implements Student {

    private String grade;
    private int attendance;

    // Constructor
    UG_Students(String grade, int attendance) {
        this.grade = grade;
        this.attendance = attendance;
    }

    // Overriding Display_Grade method
    @Override
    public void Display_Grade() {
        System.out.println("UG Student grade = " + grade);
    }

    // Overriding ShowAttendance method
    @Override
    public void ShowAttendance() {
        System.out.println("UG Student Atttribute = " + attendance + "%");
    }
}

public class studentDemo {
    public static void main(String[] args) {

        // Creating PG students object
        PG_Students pg = new PG_Students("A", 90);

        // Creating UG students object
        UG_Students ug = new UG_Students("B+", 82);

        // PG Student Details
        pg.Display_Grade();
        pg.ShowAttendance();

        System.out.println();

        // UG Student Details
        ug.Display_Grade();
        ug.ShowAttendance();
    }
}
