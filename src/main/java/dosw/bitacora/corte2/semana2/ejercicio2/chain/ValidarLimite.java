package dosw.bitacora.corte2.semana2.ejercicio2.chain;

public class ValidarLimite extends ValidadorHandler {
    public void procesar(double monto) {
        if (monto > 5000) {
            System.out.println("Limite de transaccion superado");
            return;
        }
        System.out.println("Limite validado");
        procesarSiguiente(monto);
    }
}