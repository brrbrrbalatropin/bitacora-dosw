package dosw.bitacora.semana3.ChainOfResponsability8;

public class PasaporteControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isPasaporteValido()) {
            System.out.println("Pasaporte Rechazado");
        } else {
            System.out.println("Pasaporte Aprobado");
            pasarAlSiguiente(request);
        }
    }
}