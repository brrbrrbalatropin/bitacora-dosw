package dosw.bitacora.semana3.Decorator7.Decorators;

import dosw.bitacora.semana3.Decorator7.Model.Barco;
import dosw.bitacora.semana3.Decorator7.Model.BarcoBaseDecorador;

public class RadarDecorator extends BarcoBaseDecorador {

    public RadarDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Radar";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 5;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}