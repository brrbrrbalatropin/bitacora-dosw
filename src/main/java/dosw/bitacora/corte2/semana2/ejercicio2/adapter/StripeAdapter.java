package dosw.bitacora.corte2.semana2.ejercicio2.adapter;

import dosw.bitacora.corte2.semana2.ejercicio2.api.StripeAPI;

public class StripeAdapter implements ProcesadorDePago {
    private StripeAPI api = new StripeAPI();

    public String procesarPago(double monto) {
        return api.createCharge(monto);
    }
}