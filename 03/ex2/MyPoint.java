public class MyPoint {
        private double x;
        private double y;
    
        public MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

public double Distance(MyPoint another){
    double xdiff = this.x - another.x;
    double ydiff = this.y - another.y;
    return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
}
@Override
    public String toString() {
    return "(" + x + "," + y + ")";
}

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
}
