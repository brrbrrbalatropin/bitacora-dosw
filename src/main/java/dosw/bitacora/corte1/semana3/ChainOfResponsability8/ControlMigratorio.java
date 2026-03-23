package dosw.bitacora.corte1.semana3.ChainOfResponsability8;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest request);
}