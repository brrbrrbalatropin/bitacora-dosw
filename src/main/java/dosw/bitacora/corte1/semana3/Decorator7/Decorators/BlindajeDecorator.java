package dosw.bitacora.corte1.semana3.Decorator7.Decorators;

import dosw.bitacora.corte1.semana3.Decorator7.Model.Barco;
import dosw.bitacora.corte1.semana3.Decorator7.Model.BarcoBaseDecorador;

public class BlindajeDecorator extends BarcoBaseDecorador {

    public BlindajeDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Blindaje";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 20;
    }
}