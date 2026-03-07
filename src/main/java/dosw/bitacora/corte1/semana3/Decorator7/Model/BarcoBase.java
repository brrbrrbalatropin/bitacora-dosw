package dosw.bitacora.corte1.semana3.Decorator7.Model;

public class BarcoBase implements Barco {

    @Override
    public String getDescripcion() {
        return "Barco Base";
    }

    @Override
    public int poderAtaque() {
        return 10;
    }

    @Override
    public int defensa() {
        return 5;
    }
}
