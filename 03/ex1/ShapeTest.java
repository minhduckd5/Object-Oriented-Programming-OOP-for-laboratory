import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MyShape> shapes = new ArrayList<>();
        int shapeChoice;
        int length;
        double width, height, majorAxis, minorAxis;

        System.out.println("Please select 5 shapes to create:");

            System.out.println("1. Line");
            System.out.println("2. Oval");
            System.out.println("3. Rectangle");
            System.out.print("Enter choice (1-3): ");
            shapeChoice = scanner.nextInt();

            switch (shapeChoice) {
                case 1: // Line
                    System.out.print("Enter the length of the line: ");
                    length = scanner.nextInt();
                    shapes.add(new MyLine(length));
                    break;
                case 2: // Oval
                    System.out.print("Enter the major axis length: ");
                    majorAxis = scanner.nextDouble();
                    System.out.print("Enter the minor axis length: ");
                    minorAxis = scanner.nextDouble();
                    shapes.add(new MyOval(majorAxis, minorAxis));
                    break;
                case 3: // Rectangle
                    System.out.print("Enter the width of the rectangle: ");
                    width = scanner.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    height = scanner.nextDouble();
                    shapes.add(new MyRectangle(width, height));
                    break;
                default:

            }
        

        // Draw the shapes and show area if applicable
        for (MyShape shape : shapes) {
            shape.draw();
            if (shape instanceof MyBoundedShape) {
                System.out.printf("The area of the shape is: %.2f\n", ((MyBoundedShape) shape).getArea());
            }
        }

        scanner.close();
    }
}
