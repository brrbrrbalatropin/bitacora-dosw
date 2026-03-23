package dosw.bitacora.corte1.semana2.patrones.Ejercicio2;

import java.time.LocalDateTime;

public class ImpresoraDetallada {

    public void imprimirConDetalles(String texto, String autor, LocalDateTime fecha) {
        System.out.println("Xxx Texto: " + texto + " xxX");
        System.out.println("Xxx Autor: " + autor + " xxX");
        System.out.println("Xxx Fecha: " + fecha + " xxX");
    }
}