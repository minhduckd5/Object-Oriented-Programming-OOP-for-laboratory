public class MyOval extends MyBoundedShape {
    private double majorAxis;
    private double minorAxis;

    public MyOval(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }



    @Override
    public void draw(){
        System.out.println("Drawing an oval with major axis " + majorAxis + " and minor axis " + minorAxis);
        double semi_majoraxis = majorAxis / 2.0;
        double semi_minoraxis = minorAxis / 2.0;
            // Center of the oval
        double h = majorAxis / 2.0;
        double k = minorAxis / 2.0;
        // Use these to determine the bounds of the loop.
        // They're rounded up to make sure the full axis lengths are drawn.
        int rows = (int)Math.ceil(minorAxis);
        int columns = (int)Math.ceil(majorAxis);
                for (int y = 0; y <= rows; y++) {
                for (int x = 0; x <= columns; x++) {
                // Check if the current (x, y) point is within the ellipse bounds
                double dx = x - h;
                double dy = y - k;
                // We use "< 1" to draw the boundary and "<= 1" to fill the ellipse
                if ((dx * dx) / (semi_majoraxis * semi_majoraxis) + (dy * dy) / (semi_minoraxis * semi_minoraxis) <= 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}