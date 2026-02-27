package dosw.bitacora.semana3.ChainOfResponsability8;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest request);
}