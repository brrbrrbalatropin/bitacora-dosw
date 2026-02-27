package dosw.bitacora.semana3.ChainOfResponsability8;

public abstract class ControlMigratorioHandler implements ControlMigratorio {
    private ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
    }

    protected void pasarAlSiguiente(IngresoRequest request) {
        if (siguiente != null) {
            siguiente.procesar(request);
        }
    }
}