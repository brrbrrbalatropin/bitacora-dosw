package dosw.bitacora.corte2.semana2.ejercicio2.adapter;

import dosw.bitacora.corte2.semana2.ejercicio2.api.PayPalAPI;

public class PayPalAdapter implements ProcesadorDePago {
    private PayPalAPI api = new PayPalAPI();

    public String procesarPago(double monto) {
        return api.sendPayment(monto);
    }
}