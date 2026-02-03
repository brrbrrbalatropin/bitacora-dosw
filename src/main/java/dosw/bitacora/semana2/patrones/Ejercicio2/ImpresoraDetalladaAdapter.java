package dosw.bitacora.semana2.patrones.Ejercicio2;

import java.time.LocalDateTime;

public class ImpresoraDetalladaAdapter implements Impresora {

    private ImpresoraDetallada impresoraDetallada;
    private String autor;

    public ImpresoraDetalladaAdapter(String autor) {
        this.impresoraDetallada = new ImpresoraDetallada();
        this.autor = autor;
    }

    @Override
    public void imprimir(String mensaje) {
        LocalDateTime fechaActual = LocalDateTime.now(); //pone la fecha de hoy
        impresoraDetallada.imprimirConDetalles(mensaje, autor, fechaActual);
    }
}