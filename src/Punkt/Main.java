package Punkt;

public class Main {

    public static void main(String[] args)
    {
        MetrykaCzebysz met1 = new MetrykaCzebysz();
        Metryka met2 = new MetrykaEuklid();
        Metryka met3 = new MetrykaMan();
        Punkt3D punkt1 = new Punkt3D(1, 0, 1);
        Punkt3D punkt2 = new Punkt3D(0, 0, 1);
        Punkt3D punkt3 = new Punkt3D(1, 1, 0);
        System.out.printf("Metryka czebszysza "  + punkt1.whoCloser(punkt2,punkt3, met1) + "\n");
        System.out.printf("Metryka euklidesowa " + punkt1.whoCloser(punkt2,punkt3, met2) + "\n");
        System.out.printf("Metryka Manhatan  " + punkt1.whoCloser(punkt2,punkt3, met3));

    }
}
