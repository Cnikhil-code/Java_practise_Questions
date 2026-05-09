public class Rectangle {
    // Atttribute
    double width;
    double length;
    double area;
    String color;

    // Set Length
    public void Set_Length(double length) {
        this.length = length;
    }

    // Set Width
    public void Set_Width(double width) {
        this.width = width;
    }

    // Find area
    public void Find_Area() {
        area = length * width;
    }

    // Main Method
    public static void main(String[] args) {

        // Creating Object 1
        Rectangle rect1 = new Rectangle();
        rect1.Set_Length(10);
        rect1.Set_Width(5);
        rect1.color = "Red";
        rect1.Find_Area();

        // Creating Object 2
        Rectangle rect2 = new Rectangle();
        rect2.Set_Length(8);
        rect2.Set_Width(7);
        rect2.color = "Blue";
        rect2.Find_Area();

        // Printing Details
        System.out.println("=== Rectangle 1 ===");
        System.out.println("Color : " + rect1.color);
        System.out.println("Length : " + rect1.length);
        System.out.println("Width : " + rect1.width);
        System.out.println("Area : " + rect1.area);

        System.out.println("=== Rectangle 2 ===");
        System.out.println("Color : " + rect2.color);
        System.out.println("Length : " + rect2.length);
        System.out.println("Width : " + rect2.width);
        System.out.println("Area : " + rect2.area);

        // Comparing Areas
        System.out.println("\n=== Comparison ===");
        if (rect1.area > rect2.area) {
            System.out.println("Rectangle 1 has LARGER area: " + rect1.area);
        } else if (rect2.area > rect1.area) {
            System.out.println("Rectangle 2 has LARGER area: " + rect2.area);
        } else {
            System.out.println("Both Rectangles are EQUAL area: " + rect1.area);
        }
    }
}
