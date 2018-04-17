package Punkt;

public class MetrykaEuklid extends MetrykaCzebysz implements Metryka
{
    @Override
    public double Distance(Punkt3D p1, Punkt3D p2)
    {
       return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2)+
                       Math.pow(p1.getY() - p2.getY(), 2)+
               Math.pow(p1.getZ() - p2.getZ(), 2));

    }




}
