package Punkt;

public class MetrykaMan implements Metryka
{
    @Override
    public double Distance(Punkt3D p1, Punkt3D p2) {

        return Math.abs(p1.getX() - p2.getX()) +
                Math.abs(p1.getY() - p2.getY()) +
                Math.abs(p1.getZ() - p2.getZ());
    }
}
