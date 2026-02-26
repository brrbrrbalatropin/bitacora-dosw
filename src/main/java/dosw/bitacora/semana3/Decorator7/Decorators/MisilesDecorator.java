package dosw.bitacora.semana3.Decorator7.Decorators;

import dosw.bitacora.semana3.Decorator7.Model.Barco;
import dosw.bitacora.semana3.Decorator7.Model.BarcoBaseDecorador;

public class MisilesDecorator extends BarcoBaseDecorador {

    public MisilesDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Misiles";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 30;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}