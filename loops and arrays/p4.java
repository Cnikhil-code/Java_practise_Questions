// Average of Marks

public class p4 {
    public static void main(String[] args) {
        int[] marks = { 50, 70, 65, 80, 56 };
        int total = 0;

        for (int m : marks) {
            total += m;
        }

        double average = (double) total / marks.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
