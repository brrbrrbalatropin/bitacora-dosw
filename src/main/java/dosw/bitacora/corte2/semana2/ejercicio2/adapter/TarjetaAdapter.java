package dosw.bitacora.corte2.semana2.ejercicio2.adapter;

import dosw.bitacora.corte2.semana2.ejercicio2.api.TarjetaAPI;

public class TarjetaAdapter implements ProcesadorDePago {
    private TarjetaAPI api = new TarjetaAPI();

    public String procesarPago(double monto) {
        return api.authorizeCard(monto);
    }
}