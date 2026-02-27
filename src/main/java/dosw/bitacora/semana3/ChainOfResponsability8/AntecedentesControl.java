package dosw.bitacora.semana3.ChainOfResponsability8;

public class AntecedentesControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isAntecedentesLimpios()) {
            System.out.println("Rechazado antecedentes");
        } else {
            System.out.println("Aprovado antecedentes");
            pasarAlSiguiente(request);
        }
    }
}