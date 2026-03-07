package dosw.bitacora.corte1.semana2.patrones.Ejercicio2;

public class PruebaAdapter {

    public static void main(String[] args) {
        // El sistema solo conoce la interfaz Impresora
        Impresora impresora1 = new ImpresoraSimpleAdapter();
        Impresora impresora2 = new ImpresoraDetalladaAdapter("Daniel Rayo");

        //impresora simple
        impresora1.imprimir("sample text");

        //impresora detallada con el adapter
        impresora2.imprimir("ya no es un sample text");

        //el sistema puede usar cualquiera sin saber cual es y solo imprime el 2
        imprimirMensaje(impresora1, "Mensaje enviado por impresora 1");
        imprimirMensaje(impresora2, "Mensaje enviado por impresora 2");
    }

    // Este metodo solo depende de la interfaz Impresora
    private static void imprimirMensaje(Impresora impresora, String mensaje) {
        impresora.imprimir(mensaje);
    }
}