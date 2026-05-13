// Abstract class
abstract class Shape {

    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass Circle
class Circle extends Shape {

    // Providing implementation of abstract method
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class abstract_code {
    public static void main(String[] args) {

        // Creating object of subclass
        Circle c = new Circle();

        // Calling methods
        c.display();
        c.draw();
    }
}
