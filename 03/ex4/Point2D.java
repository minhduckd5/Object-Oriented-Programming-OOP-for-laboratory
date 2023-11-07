//scanner
import java.util.Scanner;
public class Point2D {
    private float x,y;

    public Point2D (float x,float y) {
        this.x = x;
        this.y = y;
    }
    //getter
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    //setter xy void
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    //getter XY array float[2]
    public float[] getXY() {
        float[] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }
    //setter void
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    //toString (x,y)
    public String toString() {
        return "("+x+","+y+")";
    }
    //main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2D
        System.out.println("Enter x:");
        float x = sc.nextFloat();
        System.out.println("Enter y:");
        float y = sc.nextFloat();
        Point2D p = new Point2D(x,y);
        System.out.println(p);

        //3D
        System.out.println("Enter z:");
        float z = sc.nextFloat();
        Point3D p3 = new Point3D(x,y,z);
        System.out.println(p3);
        sc.close();
    }
}
