public class Point3D extends Point2D {
    private float z;

    public Point3D (float x,float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    //setter void xyz
    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    //getter xyz float[3]
    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = super.getX();
        XYZ[1] = super.getY();
        XYZ[2] = z;
        return XYZ;
    }
    //toString (x,y,z)
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+z+")";
    }
}
