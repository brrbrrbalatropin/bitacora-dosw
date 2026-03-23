package dosw.bitacora.corte2.semana2.ejercicio2;

import dosw.bitacora.corte2.semana2.ejercicio2.adapter.ProcesadorDePago;
import dosw.bitacora.corte2.semana2.ejercicio2.chain.Validador;

public class SistemaPagos {
    private Validador validador;
    private ProcesadorDePago procesador;

    public SistemaPagos(Validador validador, ProcesadorDePago procesador) {
        this.validador = validador;
        this.procesador = procesador;
    }

    public String realizarPago(double monto) {
        validador.procesar(monto);
        return procesador.procesarPago(monto);
    }
}