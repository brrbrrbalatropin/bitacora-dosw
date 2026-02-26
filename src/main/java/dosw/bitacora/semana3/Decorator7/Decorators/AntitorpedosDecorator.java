package dosw.bitacora.semana3.Decorator7.Decorators;

import dosw.bitacora.semana3.Decorator7.Model.Barco;
import dosw.bitacora.semana3.Decorator7.Model.BarcoBaseDecorador;

public class AntitorpedosDecorator extends BarcoBaseDecorador {

    public AntitorpedosDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Antitorpedos";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 15;
    }
}
