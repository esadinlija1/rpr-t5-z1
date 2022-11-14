package ba.unsa.etf.rpr;

public class BazaDao {
    private static BazaDao instanca=null;
    private BazaDao(){

    }
     private static BazaDao getInstance(){
        if(instanca!=null)
            return new BazaDao();
        return instanca;
     }

     private static void removeInstance(){
        if(instanca==null) return;
        instanca=null;
     }

}
