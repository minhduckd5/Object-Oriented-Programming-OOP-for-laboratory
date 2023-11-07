import java.util.Scanner;
public class MyTriangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    //find 3 side from 3 vertices
    public double getPerimeter() {
        return v1.Distance(v2) + v2.Distance(v3) + v3.Distance(v1);
    }
    public String getType() {
        double a = v1.Distance(v2);
        double b = v2.Distance(v3);
        double c = v3.Distance(v1);
        if (a == b && b == c) {
            return "Equilateral";
        }
        else if (a == b || b == c || c == a) {
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }
    @Override
    public String toString() {
        return "MyTriangle[" + v1 + "," + v2 + "," + v3 + "]";
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = in.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = in.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = in.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = in.nextDouble();
        MyTriangle t = new MyTriangle(x1,y1,x2,y2,x3,y3);

        System.out.println("My Triangle is " + t);

        double p = t.getPerimeter();
        System.out.println("Perimeter is " + p);

        String type = t.getType();
        System.out.println("This is " + type);
        in.close();
    }
    
}
