package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*LaptopBuilder builder=new LaptopBuilder("Mackbook Pro");
        Laptop l=builder.build();
        l.setRam(16);
        l.setProcesor("Intel i3");
        l.setOperativniSistem("iOS");
        l.setDisk(512);
        l.setEkranVelicina(16);
        l.setBrend("Apple");
        System.out.print(l.toString());*/

        PrijevoznoSredstvoFactory factory=new PrijevoznoSredstvoFactory();
        PrijevoznoSredstvo prijevoznoSredstvo=factory.getInstance("auto");
        prijevoznoSredstvo.vrsta();

    }
}
