package dosw.bitacora.corte2.semana2.ejercicio2.chain;

public class ValidarSaldo extends ValidadorHandler {
    private double saldoDisponible;

    public ValidarSaldo(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void procesar(double monto) {
        if (monto > saldoDisponible) {
            System.out.println("Saldo insuficiente");
            return;
        }
        System.out.println("Saldo validado");
        procesarSiguiente(monto);
    }
}