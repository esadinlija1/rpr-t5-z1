package ba.unsa.etf.rpr;

public class LaptopBuilder {
    private final String model;
    private String operativniSistem;
    private String procesor;
    private String brend;
    private Integer ekranVelicina;
    private Integer ram;
    private Integer disk;


    public LaptopBuilder(String model) {
        this.model = model;
    }

    public Laptop build(){
        return new Laptop(model,operativniSistem,procesor,brend,ekranVelicina,ram,disk);
    }

    public void setOperativniSistem(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setEkranVelicina(Integer ekranVelicina) {
        this.ekranVelicina = ekranVelicina;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }
}
