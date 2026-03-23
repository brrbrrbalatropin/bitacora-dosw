package dosw.bitacora.corte2.semana2.ejercicio2.chain;

public interface Validador {
    void setSiguiente(Validador siguiente);
    void procesar(double monto);
}