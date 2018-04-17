package Punkt;

public class Punkt3D {
   private double x, y, z;
    private Punkt3D pkt;
    public double getX()
    {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    public Punkt3D()
    {

    }

    public Punkt3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public int whoCloser(Punkt3D p1, Punkt3D p2, Metryka met)
    {

       if(met.Distance(this, p1) > met.Distance(this, p2)) return 1;
        if(met.Distance(this, p1) < met.Distance(this, p2)) return -1;
        else return 0;
    }
}
