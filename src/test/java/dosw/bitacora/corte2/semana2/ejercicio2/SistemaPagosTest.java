package dosw.bitacora.corte2.semana2.ejercicio1;

import dosw.bitacora.corte2.semana2.ejercicio2.adapter.*;
import dosw.bitacora.corte2.semana2.ejercicio2.chain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaPagosTest {

    @Test
    void pruebaPayPalAdapter() {
        ProcesadorDePago procesador = new PayPalAdapter();
        String resultado = procesador.procesarPago(100);
        assertEquals("PayPal pago de: 100.0", resultado);
    }

    @Test
    void pruebaStripeAdapter() {
        ProcesadorDePago procesador = new StripeAdapter();
        String resultado = procesador.procesarPago(200);
        assertEquals("Stripe cargo de: 200.0", resultado);
    }

    @Test
    void pruebaTarjetaAdapter() {
        ProcesadorDePago procesador = new TarjetaAdapter();
        String resultado = procesador.procesarPago(300);
        assertEquals("Tiene: 300.0 autorizado en la tarjeta", resultado);
    }

    @Test
    void pruebaBancoAdapter() {
        ProcesadorDePago procesador = new BancoAdapter();
        String resultado = procesador.procesarPago(400);
        assertEquals("Banco transferencia de: 400.0", resultado);
    }

    @Test
    void pruebaValidarSaldoInsuficiente() {
        ValidarSaldo validador = new ValidarSaldo(100);
        assertDoesNotThrow(() -> validador.procesar(500));
    }

    @Test
    void pruebaValidarSaldoSuficiente() {
        ValidarSaldo validador = new ValidarSaldo(1000);
        ValidarFraude fraude = new ValidarFraude();
        validador.setSiguiente(fraude);
        assertDoesNotThrow(() -> validador.procesar(500));
    }

    @Test
    void pruebaValidarFraude() {
        ValidarFraude validador = new ValidarFraude();
        assertDoesNotThrow(() -> validador.procesar(15000));
    }

    @Test
    void pruebaValidarLimite() {
        ValidarLimite validador = new ValidarLimite();
        assertDoesNotThrow(() -> validador.procesar(6000));
    }

    @Test
    void pruebaSistemaPagosCompleto() {
        ValidarSaldo saldo = new ValidarSaldo(5000);
        ValidarFraude fraude = new ValidarFraude();
        ValidarLimite limite = new ValidarLimite();

        saldo.setSiguiente(fraude);
        fraude.setSiguiente(limite);

        SistemaPagos sistema = new SistemaPagos(saldo, new PayPalAdapter());
        String resultado = sistema.realizarPago(100);
        assertEquals("PayPal pago de: 100.0", resultado);
    }
}