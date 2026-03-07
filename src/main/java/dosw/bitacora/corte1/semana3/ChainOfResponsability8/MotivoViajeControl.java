package dosw.bitacora.corte1.semana3.ChainOfResponsability8;

public class MotivoViajeControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isMotivoValido()) {
            System.out.println("motivo Rechazado");
        } else {
            System.out.println("motivo Aprobado");
            pasarAlSiguiente(request);
        }
    }
}
