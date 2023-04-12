package module2.baitap.ss6_ke_thua.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float newX, float newY, float newZ) {
        setX(newX);
        setY(newY);
        this.z = newZ;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getZ(), z};
    }

    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + this.z +
                '}';
    }
}

