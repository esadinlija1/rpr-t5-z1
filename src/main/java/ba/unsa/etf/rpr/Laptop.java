package ba.unsa.etf.rpr;

public class Laptop {
    private String operativniSistem;
    private String procesor;
    private String brend;
    private String model;
    private Integer ekranVelicina;
    private Integer ram;
    private Integer disk;

    public Laptop(String operativniSistem, String procesor, String brend, String model, Integer ekranVelicina, Integer ram, Integer disk) {
        this.operativniSistem = operativniSistem;
        this.procesor = procesor;
        this.brend = brend;
        this.model = model;
        this.ekranVelicina = ekranVelicina;
        this.ram = ram;
        this.disk = disk;
    }

    public String getOperativniSistem() {
        return operativniSistem;
    }

    public void setOperativniSistem(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getEkranVelicina() {
        return ekranVelicina;
    }

    public void setEkranVelicina(Integer ekranVelicina) {
        this.ekranVelicina = ekranVelicina;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "operativniSistem='" + operativniSistem + '\'' +
                ", procesor='" + procesor + '\'' +
                ", brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", ekranVelicina=" + ekranVelicina +
                ", ram=" + ram +
                ", disk=" + disk +
                '}';
    }
}
