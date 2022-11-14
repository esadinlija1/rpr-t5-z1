package ba.unsa.etf.rpr;

public class PrijevoznoSredstvoFactory {

    public PrijevoznoSredstvo getInstance(String tipObjekta){
        if(tipObjekta.toLowerCase()=="brod")
            return new Brod();
        if(tipObjekta.toLowerCase()=="auto"){
            return new Auto();
        }
        return new Avion();
    }

}
