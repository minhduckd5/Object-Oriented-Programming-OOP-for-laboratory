public class MyRectangle extends MyBoundedShape {
    private double width;
    private double height;

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of width " + width + " and height " + height);

                for (int row = 0; row < height; row++) {
                    for (int col = 0; col < width; col++) {
                            System.out.print("*");                      
                    }
                    System.out.println();
                }
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
