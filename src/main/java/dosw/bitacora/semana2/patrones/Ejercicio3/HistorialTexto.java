package dosw.bitacora.semana2.patrones.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class HistorialTexto {

    private List<TextoMemento> historial;

    public HistorialTexto() {
        this.historial = new ArrayList<>();
    }

    public void guardarEstado(TextoMemento memento) {
        historial.add(memento);
    }

    public TextoMemento obtenerEstado(int indice) {
        if (indice >= 0 && indice < historial.size()) {
            return historial.get(indice);
        }return null;
    }

    public int cantidadEstados() {
        return historial.size();
    }

    public void mostrarHistorial() {
        for (int i = 0; i < historial.size(); i++) {
            System.out.println(i + " estado guardado");
        }
        System.out.println();
    }
}