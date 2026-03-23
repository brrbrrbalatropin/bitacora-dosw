package dosw.bitacora.corte1.semana3.ChainOfResponsability8;

public class AprobacionFinalControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {
        request.setAprobado(true);
        System.out.println("Aprobacion final - todo excelente");
    }
}