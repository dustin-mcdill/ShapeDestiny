public class MainShape {
    public static void main(String[] args) {
        System.out.println("Booting...");
        System.out.println("Beginning shape analysis...");
        System.out.println("Results:\n");
        // Tests circle file
        Circle circle = new Circle(1.0);
        System.out.println("Circle:");
        System.out.println("  Area: " + circle.getArea());
        System.out.println("  Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Tests Rectangl File
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println("Rectangle:");
        System.out.println("  Area: " + rectangle.getArea());
        System.out.println("  Perimeter: " + rectangle.getPerimeter());
        System.out.println("  Number of Sides: " + rectangle.numberOfSides());
        System.out.println();

        // Tests RightTriangle File
        RightTriangle rightTriangle = new RightTriangle(3.0, 4.0);
        System.out.println("RightTriangle:");
        System.out.println("  Area: " + rightTriangle.getArea());
        System.out.println("  Perimeter: " + rightTriangle.getPerimeter());
        System.out.println("  Number of Sides: " + rightTriangle.numberOfSides());
        System.out.println();

        // Tests Square File
        Square square = new Square(2.0);
        System.out.println("Square:");
        System.out.println("  Area: " + square.getArea());
        System.out.println("  Perimeter: " + square.getPerimeter());
        System.out.println("  Number of Sides: " + square.numberOfSides());
        System.out.println();

        // Tests IsoscelesRightTriangle FIle
        IsoscelesRightTriangle isoTriangle = new IsoscelesRightTriangle(3.0);
        System.out.println("IsoscelesRightTriangle:");
        System.out.println("  Area: " + isoTriangle.getArea());
        System.out.println("  Perimeter: " + isoTriangle.getPerimeter());
        System.out.println("  Number of Sides: " + isoTriangle.numberOfSides());
    }
}