abstract class Shape {

    // Two integer datas
    int side1;
    int side2;

    // Constructor
    Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Empty abstract method
    abstract void FindArea();
}

// Rectangle class
class Rectangle extends Shape {

    // Constructor
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void FindArea() {

    }

    void printArea() {
        int area = side1 * side2;
        System.out.println("------------------------");
        System.out.println("|       Rectangle      |");
        System.out.println("------------------------");
        System.out.println("Length : " + side1);
        System.out.println("Breadth : " + side2);
        System.out.println("Area : " + area);
    }
}

// Trangle class
class Triangle extends Shape {

    // Constructor
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void FindArea() {

    }

    void printArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("------------------------");
        System.out.println("|        Triangle      |");
        System.out.println("------------------------");
        System.out.println("Base : " + side1);
        System.out.println("Height : " + side2);
        System.out.println("Area : " + area);
    }
}

// Circle class
class Circle extends Shape {

    // Constructor
    Circle(int radius) {
        super(radius, 0);
    }

    @Override
    void FindArea() {

    }

    void printArea() {
        double area = Math.PI * side1 * side1;
        System.out.println("------------------------");
        System.out.println("|        Circle        |");
        System.out.println("------------------------");
        System.out.println("Radius : " + side1);
        System.out.println("Area : " + area);
    }

}

public class shapeDemo {
    public static void main(String[] args) {
        System.out.println("\n======= Shape area calculator =======\n");

        // Rectangle
        Rectangle rect = new Rectangle(10, 5);
        rect.printArea();

        System.out.println();

        // Trangle
        Triangle tri = new Triangle(8, 6);
        tri.printArea();

        System.out.println();

        // Circle: radius
        Circle circle = new Circle(7);
        circle.printArea();

        System.out.println("\n=====================================\n");
    }
}
