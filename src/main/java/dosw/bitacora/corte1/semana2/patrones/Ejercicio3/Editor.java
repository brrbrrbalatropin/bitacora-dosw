package dosw.bitacora.corte1.semana2.patrones.Ejercicio3;

public class Editor {

    private String contenido;

    public Editor() {
        this.contenido = "";
    }

    public void escribir(String texto) {
        this.contenido = texto;
    }

    public String getContenido() {
        return contenido;
    }

    //crea el memento
    public TextoMemento guardar() {
        return new TextoMemento(contenido);
    }

    //restaura el memento
    public void restaurar(TextoMemento memento) {
        this.contenido = memento.getContenido();
    }
}