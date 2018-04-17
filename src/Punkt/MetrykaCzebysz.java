package Punkt;

public class MetrykaCzebysz implements Metryka {

    @Override
    public double Distance(Punkt3D p1, Punkt3D p2) {
        double[] points = { Math.abs(p1.getX() - p2.getX()), Math.abs(p1.getY() - p2.getY()), Math.abs(p1.getZ() - p2.getZ())};
        return maxValue(points);
    }

    protected double getLength(double a, double b)
    {
        return Math.sqrt(Math.abs(Math.pow(a,2) + Math.pow(b, 2)));
    }
    protected double maxValue(double elements[])
    {
        double maxVal = elements[0];
        for(int iLoop = 0; iLoop<elements.length; iLoop++)
        {
            if(elements[iLoop]> maxVal)  maxVal = elements[iLoop];

        }
        return maxVal;
    }
}
