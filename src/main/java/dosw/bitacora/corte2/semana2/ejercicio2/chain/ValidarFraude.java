package dosw.bitacora.corte2.semana2.ejercicio2.chain;

public class ValidarFraude extends ValidadorHandler {
    public void procesar(double monto) {
        if (monto > 10000) {
            System.out.println("Transaccion sospechosa de fraude");
            return;
        }
        System.out.println("No hay fraude");
        procesarSiguiente(monto);
    }
}