package dosw.bitacora.semana2.patrones.Ejercicio3;

public class TextoMemento {

    private final String contenido;

    public TextoMemento(String contenido) {
        this.contenido = contenido;
    }

    protected String getContenido() {
        return contenido;
    }
}