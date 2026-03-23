package dosw.bitacora.corte1.semana2.patrones.Ejercicio2;

public class ImpresoraSimpleAdapter implements Impresora {

    private ImpresoraSimple impresoraSimple;

    public ImpresoraSimpleAdapter() {
        this.impresoraSimple = new ImpresoraSimple();
    }

    @Override
    public void imprimir(String mensaje) {
        impresoraSimple.imprimirTexto(mensaje);
    }
}