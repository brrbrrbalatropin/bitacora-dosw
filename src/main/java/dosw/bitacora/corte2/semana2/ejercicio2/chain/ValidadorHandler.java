package dosw.bitacora.corte2.semana2.ejercicio2.chain;

public abstract class ValidadorHandler implements Validador {
    private Validador siguiente;

    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    protected void procesarSiguiente(double monto) {
        if (siguiente != null) {
            siguiente.procesar(monto);
        }
    }
}