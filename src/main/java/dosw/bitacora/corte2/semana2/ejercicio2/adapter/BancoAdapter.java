package dosw.bitacora.corte2.semana2.ejercicio2.adapter;

import dosw.bitacora.corte2.semana2.ejercicio2.api.BancoAPI;

public class BancoAdapter implements ProcesadorDePago {
    private BancoAPI api = new BancoAPI();

    public String procesarPago(double monto) {
        return api.transferirFondos(monto);
    }
}